package vr.xinjing.com.vrmc.bean;

import java.io.Serializable;

/**
 * 单一内容详情
 * Created by raytine on 2017/2/10.
 */

public class PrescriptionInfo implements Serializable {


    /**
     * success : true
     * code : 0
     * message : 获取单个内容成功
     * data : {"ext":{"id":"8a2b4be857d718e70157db7204640008","content":"http://vod.med-vision.cn/?Expires=1497263415&OSSAccessKeyId=LTAIJNwd9qadQHPz&Signature=%2BFKPVLs9mxjpEdp1lQYEnU%2BbO/g%3D"},"creator":"00000000000000000000000000000001","hidden":0,"videoupdateAt":"2016-10-19 13:42:05","description":"测试音频1","remark":"测试音频1","helpCode":"audio1","type":2,"otherdisease":null,"duration":0,"createdAt":"2016-10-19 13:37:38","isFree":1,"price":0,"name":"测试音频1","clicks":0,"updator":"00000000000000000000000000000001","coverPic":"http://static.dosnsoft.com/test%2F1476855457995.png","id":"8a2b4be857d718e70157db71ea0b0007","status":2,"updatedAt":"2016-10-19 13:42:05"}
     */

    private boolean success;
    private int code;
    private String message;
    /**
     * ext : {"id":"8a2b4be857d718e70157db7204640008",
     * "content":"http://vod.med-vision.cn/?Expires=1497263415&OSSAccessKeyId=LTAIJNwd9qadQHPz&Signature=%2BFKPVLs9mxjpEdp1lQYEnU%2BbO/g%3D"}
     * creator : 00000000000000000000000000000001
     * hidden : 0
     * videoupdateAt : 2016-10-19 13:42:05
     * description : 测试音频1
     * remark : 测试音频1
     * helpCode : audio1
     * type : 2
     * otherdisease : null
     * duration : 0
     * createdAt : 2016-10-19 13:37:38
     * isFree : 1
     * price : 0
     * name : 测试音频1
     * clicks : 0
     * updator : 00000000000000000000000000000001
     * coverPic : http://static.dosnsoft.com/test%2F1476855457995.png
     * id : 8a2b4be857d718e70157db71ea0b0007
     * status : 2
     * updatedAt : 2016-10-19 13:42:05
     */

    private DataEntity data;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity implements Serializable{
        /**
         * id : 8a2b4be857d718e70157db7204640008
         * content : http://vod.med-vision.cn/?Expires=1497263415&OSSAccessKeyId=LTAIJNwd9qadQHPz&Signature=%2BFKPVLs9mxjpEdp1lQYEnU%2BbO/g%3D
         */

        private ExtEntity ext;
        private String creator;
        private int hidden;
        private String videoupdateAt;
        private String description;
        private String remark;
        private String helpCode;
        private int type;
        private Object otherdisease;
        private int duration;
        private String createdAt;
        private int isFree;
        private int price;
        private String name;
        private int clicks;
        private String updator;
        private String coverPic;
        private String id;
        private int status;
        private String updatedAt;

        public void setExt(ExtEntity ext) {
            this.ext = ext;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public void setHidden(int hidden) {
            this.hidden = hidden;
        }

        public void setVideoupdateAt(String videoupdateAt) {
            this.videoupdateAt = videoupdateAt;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setHelpCode(String helpCode) {
            this.helpCode = helpCode;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setOtherdisease(Object otherdisease) {
            this.otherdisease = otherdisease;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setIsFree(int isFree) {
            this.isFree = isFree;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setClicks(int clicks) {
            this.clicks = clicks;
        }

        public void setUpdator(String updator) {
            this.updator = updator;
        }

        public void setCoverPic(String coverPic) {
            this.coverPic = coverPic;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public ExtEntity getExt() {
            return ext;
        }

        public String getCreator() {
            return creator;
        }

        public int getHidden() {
            return hidden;
        }

        public String getVideoupdateAt() {
            return videoupdateAt;
        }

        public String getDescription() {
            return description;
        }

        public String getRemark() {
            return remark;
        }

        public String getHelpCode() {
            return helpCode;
        }

        public int getType() {
            return type;
        }

        public Object getOtherdisease() {
            return otherdisease;
        }

        public int getDuration() {
            return duration;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public int getIsFree() {
            return isFree;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public int getClicks() {
            return clicks;
        }

        public String getUpdator() {
            return updator;
        }

        public String getCoverPic() {
            return coverPic;
        }

        public String getId() {
            return id;
        }

        public int getStatus() {
            return status;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public static class ExtEntity implements Serializable{
            private String id;
            private String content;

            public void setId(String id) {
                this.id = id;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getId() {
                return id;
            }

            public String getContent() {
                return content;
            }
        }
    }
}
