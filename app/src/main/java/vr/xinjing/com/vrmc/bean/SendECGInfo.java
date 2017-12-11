package vr.xinjing.com.vrmc.bean;

/**
 * Created by raytine on 2017/12/2.
 */

public class SendECGInfo {

    /**
     * success : true
     * code : 0
     * message : 发送播放记录对应的心率数据成功!
     * data : {"id":"2c90e5c76015e43f0160164b4a9c0050","creator":"2c90e40a5ec4108b015f099a93650199","createdAt":"2017-12-02 16:15:21","updator":"2c90e40a5ec4108b015f099a93650199","updatedAt":"2017-12-02 16:15:21","clickRecordId":"2c90e5c76015e43f0160164aadef004e","patientcaseid":"2c90e40a5d2a79e2015d2a9b0f32001e","bytes":"89020110E1070C020000000000000000000000008902021000000000000000000000000000000000890203100000000000000000000000000000000089020410000000000000000000000000000000008902051000000000000000000000000000000000890206100000000000000000000000000000000089020710000000000000000000000000000000008902081000000000000000000000000000000000890209100000000000000000000000000000000089028A080000000000000000","hidden":0}
     */

    private boolean success;
    private int code;
    private String message;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 2c90e5c76015e43f0160164b4a9c0050
         * creator : 2c90e40a5ec4108b015f099a93650199
         * createdAt : 2017-12-02 16:15:21
         * updator : 2c90e40a5ec4108b015f099a93650199
         * updatedAt : 2017-12-02 16:15:21
         * clickRecordId : 2c90e5c76015e43f0160164aadef004e
         * patientcaseid : 2c90e40a5d2a79e2015d2a9b0f32001e
         * bytes : 89020110E1070C020000000000000000000000008902021000000000000000000000000000000000890203100000000000000000000000000000000089020410000000000000000000000000000000008902051000000000000000000000000000000000890206100000000000000000000000000000000089020710000000000000000000000000000000008902081000000000000000000000000000000000890209100000000000000000000000000000000089028A080000000000000000
         * hidden : 0
         */

        private String id;
        private String creator;
        private String createdAt;
        private String updator;
        private String updatedAt;
        private String clickRecordId;
        private String patientcaseid;
        private String bytes;
        private int hidden;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdator() {
            return updator;
        }

        public void setUpdator(String updator) {
            this.updator = updator;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getClickRecordId() {
            return clickRecordId;
        }

        public void setClickRecordId(String clickRecordId) {
            this.clickRecordId = clickRecordId;
        }

        public String getPatientcaseid() {
            return patientcaseid;
        }

        public void setPatientcaseid(String patientcaseid) {
            this.patientcaseid = patientcaseid;
        }

        public String getBytes() {
            return bytes;
        }

        public void setBytes(String bytes) {
            this.bytes = bytes;
        }

        public int getHidden() {
            return hidden;
        }

        public void setHidden(int hidden) {
            this.hidden = hidden;
        }
    }
}
