package vr.xinjing.com.vrmc.presenter;

import android.os.Handler;

import java.util.HashMap;
import java.util.Map;

import vr.xinjing.com.vrmc.bean.IsBleInfo;
import vr.xinjing.com.vrmc.imp.IsBle;
import vr.xinjing.com.vrmc.model.CheckBleModel;
import vr.xinjing.com.vrmc.utils.SpUtils;

/**
 * Created by raytine on 2017/11/30.
 */

public class CheckBlePresenter {
    private IsBle mIsBle;
    private CheckBleModel mCheckBleModel;
    private Handler handler = new Handler();
    private Map<String,String> map ;
    public CheckBlePresenter(IsBle mIsBle) {
        this.mIsBle = mIsBle;
        mCheckBleModel = new CheckBleModel();
        map = new HashMap<>();
        map.put("token", SpUtils.getInstance().getToken());
    }
    public void getDeviceIsBLEPressmes() {
        mCheckBleModel.getDeviceIsBLEPressmes(map, new CheckBleModel.checkBleModelListener() {
            @Override
            public void bleSuccess(IsBleInfo info) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mIsBle.getIsBleSuccess(info);
                    }
                });
            }

            @Override
            public void tokenChange() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mIsBle.tokenchange();
                    }
                });
            }

            @Override
            public void bleFailed(IsBleInfo info) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mIsBle.getIsBleFailed(info);
                    }
                });
            }
        });
    }
}
