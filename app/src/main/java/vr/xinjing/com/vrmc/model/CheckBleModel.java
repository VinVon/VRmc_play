package vr.xinjing.com.vrmc.model;

import com.utovr.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.Map;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Response;
import vr.xinjing.com.vrmc.UrlPath.UrlHttp;
import vr.xinjing.com.vrmc.bean.IsBleInfo;
import vr.xinjing.com.vrmc.bean.LastAyncInfo;
import vr.xinjing.com.vrmc.imp.IsBle;

/**
 * Created by raytine on 2017/11/30.
 */

public class CheckBleModel {

    public void getDeviceIsBLEPressmes(Map<String,String> map, final checkBleModelListener onLoginListener) {
        OkHttpUtils.postString()
                .url(UrlHttp.PATH_CHECKBLE)
                .content(new Gson().toJson(map))
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(new Callback() {
                    @Override
                    public Object parseNetworkResponse(Response response, int id) throws Exception {
                        Gson gson = new Gson();
                        IsBleInfo lastAyncInfo = (IsBleInfo) gson.fromJson(response.body().string(),IsBleInfo.class);
                        if (lastAyncInfo.getCode() == 0 && lastAyncInfo.getData() !=null){
                            onLoginListener.bleSuccess(lastAyncInfo);
                        }else if(lastAyncInfo.getCode() == 95 ||lastAyncInfo.getCode() == 96 ||lastAyncInfo.getCode() ==97||lastAyncInfo.getCode() ==98){
                            onLoginListener.tokenChange();
                        }else{
                            onLoginListener.bleFailed(lastAyncInfo);
                        }
                        return null;

                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(Object response, int id) {

                    }
                });
    }
    public interface checkBleModelListener
    {
        void bleSuccess(IsBleInfo info);
        void tokenChange();
        void bleFailed(IsBleInfo info);
    }
}
