package vr.xinjing.com.vrmc.utils;

/**
 * Created by raytine on 2017/12/1.
 */

public class ToHexByteUtils {
    public static byte[] hexStringToByte(String hex) {
        int len = (hex.length() / 2);
        byte[] result = new byte[len];
        char[] achar = hex.toCharArray();
        for (int i = 0; i < len; i++) {
            int pos = i * 2;
            result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
        }
        return result;
    }
    private static byte toByte(char c) {
        byte b = (byte) "0123456789ABCDEF".indexOf(c);
        return b;
    }

    public static String bytesToHexString(byte[] value) {
        StringBuffer sb = new StringBuffer(value.length);
        String sTemp;
        for (int i = 0; i < value.length; i++) {
            sTemp = Integer.toHexString(0xFF & value[i]);
            if (sTemp.length() < 2)
                sb.append(0);
            sb.append(sTemp.toUpperCase());
        }
        return sb.toString();
    }
}
