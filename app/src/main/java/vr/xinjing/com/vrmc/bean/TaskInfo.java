package vr.xinjing.com.vrmc.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by raytine on 2017/4/10.
 */

public class TaskInfo implements Serializable {

    /**
     * code : 0
     * data : [{"content":"string",
     * "createdAt":"2017-04-10T07:10:08.371Z",
     * "creator":"string",
     * "endType":true,
     * "id":"string",
     * "userId":"string"
     * "playType":true
     * ,"prescriptionContentId":"string","status":0,"type":0,"updatedAt":"2017-04-10T07:10:08.371Z","updator":"string",}]
     * message : string
     * success : true
     */

    private int code;
    private String message;
    private boolean success;
    private List<DataBean> data;

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

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable{
        /**
         * content : string
         * createdAt : 2017-04-10T07:10:08.371Z
         * creator : string
         * endType : true
         * id : string
         * playType : true
         * prescriptionContentId : string
         * status : 0
         * type : 0
         * updatedAt : 2017-04-10T07:10:08.371Z
         * updator : string
         * userId : string
         */

        private String content;
        private String createdAt;
        private String creator;
        private boolean endType;
        private String id;
        private boolean playType;
        private Object prescriptionContentId;
        private int status;
        private int type;
        private String updatedAt;
        private String updator;
        private String userId;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public boolean isEndType() {
            return endType;
        }

        public void setEndType(boolean endType) {
            this.endType = endType;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean isPlayType() {
            return playType;
        }

        public void setPlayType(boolean playType) {
            this.playType = playType;
        }

        public Object getPrescriptionContentId() {
            return prescriptionContentId;
        }

        public void setPrescriptionContentId(String prescriptionContentId) {
            this.prescriptionContentId = prescriptionContentId;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getUpdator() {
            return updator;
        }

        public void setUpdator(String updator) {
            this.updator = updator;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
