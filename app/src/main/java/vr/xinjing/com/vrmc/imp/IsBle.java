package vr.xinjing.com.vrmc.imp;

import vr.xinjing.com.vrmc.bean.IsBleInfo;

/**
 * Created by raytine on 2017/11/30.
 */

public interface IsBle{
    void getIsBleSuccess(IsBleInfo info);
    void getIsBleFailed(IsBleInfo info);
    public void tokenchange();
}
