package vr.xinjing.com.vrmc.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import vr.xinjing.com.vrmc.AuthorizationActivity;
import vr.xinjing.com.vrmc.MainActivity;
import vr.xinjing.com.vrmc.PlayerActivity;
import vr.xinjing.com.vrmc.R;
import vr.xinjing.com.vrmc.bean.IConstant;
import vr.xinjing.com.vrmc.bean.LocalInfo;
import vr.xinjing.com.vrmc.bean.LoginInfo;
import vr.xinjing.com.vrmc.imp.LoginView;
import vr.xinjing.com.vrmc.presenter.LoginPresenter;
import vr.xinjing.com.vrmc.utils.SpUtils;
import vr.xinjing.com.vrmc.utils.ToastCommom;

/**
 * Created by raytine on 2017/2/11.
 */

public class WelcomeActivity extends BaseActivity implements LoginView{
    private static String device_model ;
    private static String version_release ;
    private static String version ;
    private static String device_id ;
    private String username;
    private String passworld;
    private boolean isfirst ;
    LoginPresenter lp ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        getData();
        //部分手机应用挂后台会重新启动应用
        if ((getIntent().getFlags()& Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT)!=0){
            finish();
            return;
        }
        handler.sendEmptyMessageDelayed(0,3000);
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            String path = Environment.getExternalStorageDirectory()+"/vrmc/video/";
            File file = new File(path);
//            File file1 = new File(path,"123.mp3");
            if (!file.exists()) // 判断目录是否存在，如果不存在，创建目录
            {file.mkdirs();}
//            if (!file1.exists()){
//                try {
//                    file1.createNewFile();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

        }
//        String path1 = Environment.getDataDirectory()+"/data/"+getPackageName();
//
//        File file1 = new File(path1);
//        File file2 = new File(path1,"123.mp3");
//        if (!file1.exists()) // 判断目录是否存在，如果不存在，创建目录
//        {file1.mkdirs();
//        }
//                    if (!file2.exists()){
//                try {
//                    file2.createNewFile();
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        Log.e("---url",file2.getAbsolutePath());
    }
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int i = checkNetWork();
            if(i == 0 ){
                ToastCommom.createInstance().ToastShow(WelcomeActivity.this,"请检查网络连接情况");
                exitApp();
//                startActivity(new Intent(WelcomeActivity.this,PlayerActivity.class));
            }else{

            if (isfirst){
                getHome();
            }else{
                Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
//                getLogin();
            }
            }
            super.handleMessage(msg);
        }
    };

    public void getHome() {
        Intent intent = new Intent(WelcomeActivity.this, AuthorizationActivity.class);
        startActivity(intent);
        finish();
    }
    public void getLogin(){
        device_model = IConstant.getModel();
        version = IConstant.getVersion(this);
        device_id = IConstant.devoceId(this);
        version_release = IConstant.getVersionRelease();
        Map<String, String> priArgs = new HashMap<>();
        priArgs.put("appId", device_id);
        priArgs.put("appVersion", version);
        priArgs.put("channel", "null");
        priArgs.put("deviceModel", device_model);
        priArgs.put("deviceSystem", "android");
        priArgs.put("deviceVersion", version_release);
        priArgs.put("password", passworld);
        priArgs.put("username", username);
        lp = new LoginPresenter(WelcomeActivity.this,priArgs);
        lp.Login();
    }
    public void getData(){
        SpUtils instance = SpUtils.getInstance();
        instance.init(WelcomeActivity.this);
        LocalInfo user = instance.getUser();
       if (user == null){
           isfirst = true;
       }else{
           isfirst =  user.isFirstLogin();
           username=  user.getUsername();
           passworld= user.getPassword();
       }

    }

    @Override
    public void updateView(LoginInfo user) {
        if(isfirst){
            saveData(false,username,passworld,user.getData().getToken());
        }else{
            saveData(false,username,passworld,user.getData().getToken());
        }
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }

    @Override
    public void showError(String msg) {

    }
    public void  saveData(boolean st,String name,String pass,String token){
        LocalInfo info = new LocalInfo(name,pass,st,token);
        SpUtils instance = SpUtils.getInstance();
        instance.init(this);
        instance.saveUser(info);
    }
}
