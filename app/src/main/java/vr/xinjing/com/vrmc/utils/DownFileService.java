package vr.xinjing.com.vrmc.utils;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.os.StatFs;
import android.support.annotation.Nullable;
import android.util.Log;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.HttpHandler;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import me.itangqi.greendao.Note;
import vr.xinjing.com.vrmc.Appaplication;
import vr.xinjing.com.vrmc.R;
import vr.xinjing.com.vrmc.bean.IConstant;
import vr.xinjing.com.vrmc.bean.VideoInfo;
import vr.xinjing.com.vrmc.update.PreferenceUtils;
import vr.xinjing.com.vrmc.update.SDCardUtils;
import vr.xinjing.com.vrmc.update.UpdateVersionService;

/**
 * Created by raytine on 2017/2/23.
 */

public class DownFileService extends Service {
    private HttpUtils httpUtils;
    private long initTotal = 0;//文件的总长度
    private static HttpHandler<File> httpHandler;
    private String names;
    private File file;
    private NoteService noteService;//数据库操作类
    private int conpletenumber= 0;//下载完成数
    @Override
    public void onCreate() {
        Log.e("--------------","onCreate开始咯");
        httpUtils = new HttpUtils();
        httpUtils.configRequestThreadPoolSize(1);
        noteService = ((Appaplication)getApplication()).noteService;
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("--------------","onStartCommand开始咯");
        if (intent != null){
            Bundle bundle = intent.getExtras();
            String url = bundle.getString("downloadUrl");
            String time = bundle.getString("Aynctime");
            String date = bundle.getString("date");
            String contentId = bundle.getString("ContentId");
            int type = bundle.getInt("type");
            long vedioSize = bundle.getLong("vedioSize");
//            int count = bundle.getInt("count");
            int countnumber = bundle.getInt("countnumber");

                if (url != null){
                    String name = url.substring(0,url.indexOf(".mp")+4);
                    names = name.substring(name.lastIndexOf("/")+1);
                    file = new File(IConstant.STROAGE_PATH+names);
                    downLoadFile(url,file,vedioSize,time,contentId,countnumber,date,type);
                }

        }
        return super.onStartCommand(intent, flags, startId);
    }

    private void downLoadFile(String url,File file,long vedioSize,String time,String contentId,int cnm,String date,int type) {

        httpHandler = httpUtils.download(url, file.getAbsolutePath(), true, false, new RequestCallBack<File>() {
            @Override
            public void onSuccess(ResponseInfo<File> responseInfo) {
                File result = responseInfo.result;
                long l = file.length(); //下载文件的大小
                long l1 = availableSize();//手机内存大小
                Log.e("----daxiao","网络文件大小 ："+vedioSize+"--------下载文件大小 :"+l+"-----------手机内存大小 :"+l1);
                if (vedioSize> l || l1<l){
                    Log.e("------------downfileser","文件下载异常");
                    result.delete();
                }else{
                    conpletenumber+=1;
                    Log.e("----下载完成数量",conpletenumber+"个");
                    if (conpletenumber == cnm){
                        SpUtils.getInstance().saveLastAynvTime(time);
                        Log.e("------------downfileser","同步时间保存了");
                    }
                    if (noteService.isExist(result.getName())){
                        Note ci =new Note();
                        ci.setName(result.getName());
                        ci.setState(true);
                        ci.setPath(file.getAbsolutePath());
                        ci.setUrl(url);
                        ci.setType(type);
                        ci.setDate(date);
                        ci.setVodeosize(vedioSize);
                        ci.setContentid(contentId);
                        ci.setIssecret(true);
                        noteService.updateData(result.getName(),ci);
                        Log.e("------------downfileser","数据库操作完成");
                    }else{
                        Note ci =new Note();
                        ci.setName(result.getName());
                        ci.setState(true);
                        ci.setPath(file.getAbsolutePath());
                        ci.setUrl(url);
                        ci.setType(type);
                        ci.setDate(date);
                        ci.setVodeosize(vedioSize);
                        ci.setContentid(contentId);
                        ci.setIssecret(true);
                        noteService.insertNote(ci);
                    }
                }

                stopSelf();

            }

            @Override
            public void onFailure(HttpException e, String s) {
//                String st = file.getAbsolutePath();
//                if (file.exists() && st.endsWith(".mp3")) {
//                    file.delete();
//                }
                if (e.getExceptionCode() == 416){
                    Log.e("--------------","文件已经下载了");
                }
            }

            @Override
            public void onLoading(long total, long current, boolean isUploading) {
                if(initTotal == 0){//说明第一次开始下载
                    initTotal = total;
                }

                if(initTotal != total){//说明下载过程中暂停过，文件的总长度出现问题  就把初始的文件的长度赋值给他重新计算已经下载的比例
                    total = initTotal;
                }

                long l = current*100/total;
                Log.e("--------------"+file.getName(),l+ "%");
                super.onLoading(total, current, isUploading);
            }

            @Override
            public void onStart() {
                super.onStart();
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        httpHandler.cancel();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public static HttpHandler<File> getHandler(){
        return httpHandler;
    }
    private long length;
    public long downloadFileSize(final String path) {
        new Thread() {
            public void run() {
                try {
                    URL url = new URL(path);     //创建url对象
                    HttpURLConnection conn = (HttpURLConnection) url
                            .openConnection();     //建立连接
                    conn.setRequestMethod("GET");    //设置请求方法
                    conn.setReadTimeout(5000);       //设置响应超时时间
                    conn.setConnectTimeout(5000);   //设置连接超时时间
                    conn.connect();   //发送请求
                    int responseCode = conn.getResponseCode();    //获取响应码
                    if (responseCode == 200) {   //响应码是200(固定值)就是连接成功，否者就连接失败
                        length = conn.getContentLength();    //获取文件的大小
                    } else {

                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
        }.start();
        return length;
    }
    /**
     * 获取手机剩余内存大小
     *
     * @return 手机剩余内存(单位：byte)
     */
    public static long availableSize() {
        // 取得SD卡文件路径
        File file = Environment.getExternalStorageDirectory();
        StatFs fs = new StatFs(file.getPath());
        // 获取单个数据块的大小(Byte)
        int blockSize = fs.getBlockSize();
        // 空闲的数据块的数量
        long availableBlocks = fs.getAvailableBlocks();
        return blockSize * availableBlocks;
    }

}
