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
     * data : {
     * "id":"8a2b4be857e696e20157f99ab81f0006",
     * "status":2,
     * "updatedAt":"2016-10-25 14:25:18",
     * "ext":{
     * "id":"8a2b4be857e696e20157f99ab8320009",
     * "creator":"00000000000000000000000000000001",
     * "createdAt":"2016-10-25 10:10:49",
     * "updator":"00000000000000000000000000000001",
     * "updatedAt":"2016-10-25 14:25:18",
     * "contentId":"8a2b4be857e696e20157f99ab81f0006",
     * "content":"http://vod.dosnsoft.com/test/ijsKXh8AKD.mp4?Expires=1486711117&OSSAccessKeyId=LTAIJNwd9qadQHPz&Signature=DXT9LJd2NAiAj9gMNhInz3k%2BlxQ%3D"
     * },
     * "creator":"00000000000000000000000000000001",
     * "hidden":0,
     * "remark":"测试视频2",
     * "helpCode":"video2",
     * "type":1,
     * "createdAt":"2016-10-25 10:10:49",
     * "isFree":0,"price":400,
     * "name":"测试视频2",
     * "updator":"00000000000000000000000000000001",
     * "coverPic":"http://static.dosnsoft.com/test%2F1477361448881.png"}
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

    public static class DataBean implements Serializable {
        /**
         * ext : {"id":"8a2b4be857e696e20157f99ab8320009","creator":"00000000000000000000000000000001","createdAt":"2016-10-25 10:10:49","updator":"00000000000000000000000000000001","updatedAt":"2016-10-25 14:25:18","contentId":"8a2b4be857e696e20157f99ab81f0006","content":"http://vod.dosnsoft.com/test/ijsKXh8AKD.mp4?Expires=1486711117&OSSAccessKeyId=LTAIJNwd9qadQHPz&Signature=DXT9LJd2NAiAj9gMNhInz3k%2BlxQ%3D"}
         * creator : 00000000000000000000000000000001
         * hidden : 0
         * remark : 测试视频2
         * helpCode : video2
         * type : 1
         * createdAt : 2016-10-25 10:10:49
         * isFree : 0
         * price : 400.0
         * name : 测试视频2
         * updator : 00000000000000000000000000000001
         * coverPic : http://static.dosnsoft.com/test%2F1477361448881.png
         * id : 8a2b4be857e696e20157f99ab81f0006
         * status : 2
         * updatedAt : 2016-10-25 14:25:18
         *
         */

        private ExtBean ext;
        private String creator;
        private int hidden;
        private String remark;
        private String helpCode;
        private int type;
        private String createdAt;
        private int isFree;
        private double price;
        private String name;
        private String updator;
        private String coverPic;
        private String id;
        private int status;
        private String updatedAt;
        private String videoupdateAt;

        public String getVideoupdateAt() {
            return videoupdateAt;
        }

        public void setVideoupdateAt(String videoupdateAt) {
            this.videoupdateAt = videoupdateAt;
        }

        public ExtBean getExt() {
            return ext;
        }

        public void setExt(ExtBean ext) {
            this.ext = ext;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public int getHidden() {
            return hidden;
        }

        public void setHidden(int hidden) {
            this.hidden = hidden;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getHelpCode() {
            return helpCode;
        }

        public void setHelpCode(String helpCode) {
            this.helpCode = helpCode;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public int getIsFree() {
            return isFree;
        }

        public void setIsFree(int isFree) {
            this.isFree = isFree;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUpdator() {
            return updator;
        }

        public void setUpdator(String updator) {
            this.updator = updator;
        }

        public String getCoverPic() {
            return coverPic;
        }

        public void setCoverPic(String coverPic) {
            this.coverPic = coverPic;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public static class ExtBean implements Serializable {
            /**
             * id : 8a2b4be857e696e20157f99ab8320009
             * creator : 00000000000000000000000000000001
             * createdAt : 2016-10-25 10:10:49
             * updator : 00000000000000000000000000000001
             * updatedAt : 2016-10-25 14:25:18
             * contentId : 8a2b4be857e696e20157f99ab81f0006
             * content : http://vod.dosnsoft.com/test/ijsKXh8AKD.mp4?Expires=1486711117&OSSAccessKeyId=LTAIJNwd9qadQHPz&Signature=DXT9LJd2NAiAj9gMNhInz3k%2BlxQ%3D
             */

            private String id;
            private String creator;
            private String createdAt;
            private String updator;
            private String updatedAt;
            private String contentId;
            private String content;

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

            public String getContentId() {
                return contentId;
            }

            public void setContentId(String contentId) {
                this.contentId = contentId;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }

}
