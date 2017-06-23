package me.itangqi.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class Note {

    private Long id;
    /** Not-null value. */
    private String name;
    private String path;
    private Boolean state;
    private Boolean issecret;
    private String url;
    private String contentid;
    private String date;
    private Integer type;
    private Long vodeosize;

    public Note() {
    }

    public Note(Long id) {
        this.id = id;
    }

    public Note(Long id, String name, String path, Boolean state, Boolean issecret, String url, String contentid, String date, Integer type, Long vodeosize) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.state = state;
        this.issecret = issecret;
        this.url = url;
        this.contentid = contentid;
        this.date = date;
        this.type = type;
        this.vodeosize = vodeosize;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getIssecret() {
        return issecret;
    }

    public void setIssecret(Boolean issecret) {
        this.issecret = issecret;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentid() {
        return contentid;
    }

    public void setContentid(String contentid) {
        this.contentid = contentid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getVodeosize() {
        return vodeosize;
    }

    public void setVodeosize(Long vodeosize) {
        this.vodeosize = vodeosize;
    }

}
