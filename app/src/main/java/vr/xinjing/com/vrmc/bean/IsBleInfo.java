package vr.xinjing.com.vrmc.bean;

/**
 * Created by raytine on 2017/11/30.
 */

public class IsBleInfo {

    /**
     * success : true
     * code : 0
     * message : 获取根据播放端帐号获取是否有蓝牙设备权限成功!
     * data : {"id":"2c90e40a5ec4108b015f099a936b019b","creator":"2c90e40a5e363688015e3647e72b0009","createdAt":"2017-10-11 12:04:06","updator":"2c90e40a5e363688015e3647e72b0009","updatedAt":"2017-10-11 12:04:06","userId":"2c90e40a5ec4108b015f099a93650199","vrRoomId":"2c90e40a5df9f09a015e2bf4cdaf0252","remark":"公司演示播放端5","type":3,"isble":0,"bleName":null}
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
         * id : 2c90e40a5ec4108b015f099a936b019b
         * creator : 2c90e40a5e363688015e3647e72b0009
         * createdAt : 2017-10-11 12:04:06
         * updator : 2c90e40a5e363688015e3647e72b0009
         * updatedAt : 2017-10-11 12:04:06
         * userId : 2c90e40a5ec4108b015f099a93650199
         * vrRoomId : 2c90e40a5df9f09a015e2bf4cdaf0252
         * remark : 公司演示播放端5
         * type : 3
         * isble : 0
         * bleName : null
         */

        private String id;
        private String creator;
        private String createdAt;
        private String updator;
        private String updatedAt;
        private String userId;
        private String vrRoomId;
        private String remark;
        private int type;
        private int isble;
        private Object bleName;

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

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getVrRoomId() {
            return vrRoomId;
        }

        public void setVrRoomId(String vrRoomId) {
            this.vrRoomId = vrRoomId;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getIsble() {
            return isble;
        }

        public void setIsble(int isble) {
            this.isble = isble;
        }

        public Object getBleName() {
            return bleName;
        }

        public void setBleName(Object bleName) {
            this.bleName = bleName;
        }
    }
}
