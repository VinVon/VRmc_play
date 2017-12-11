package vr.xinjing.com.vrmc.imp;

import vr.xinjing.com.vrmc.bean.SendECGInfo;

/**
 * Created by raytine on 2017/12/2.
 */

public interface SendEcgimp {
    public  void  sendEcgSuccess(String info);
    public void  sendEcgFailed(SendECGInfo info);
    public void tokenchange();
}
