package vr.xinjing.com.vrmc.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import vr.xinjing.com.vrmc.R;
import vr.xinjing.com.vrmc.adapter.abs.AbstractAdapter;
import vr.xinjing.com.vrmc.adapter.abs.ViewHolder;

/**
 * Created by raytine on 2017/11/30.
 */

public class BLEDeviceAdapter extends AbstractAdapter<BluetoothDevice> {

    public BLEDeviceAdapter(Context context, List<BluetoothDevice> listData, int resId) {
        super(context, listData, resId);
    }

    @Override
    public void convert(ViewHolder holder, BluetoothDevice bean) {
        TextView tv_name = holder.getView(R.id.item_device_name);
        tv_name.setText(bean.getName());
    }
}
