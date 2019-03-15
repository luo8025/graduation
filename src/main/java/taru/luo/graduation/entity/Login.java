package taru.luo.graduation.entity;

import java.util.Date;

public class Login {
    private String id;

    private String username;

    private String password;

    private String telphone;

    private String email;

    private Date createTime;

    private String createId;

    private String lastEditorId;

    private Date lastEditorTime;

    private String deletorId;

    private Date deletorTime;

    private String deleted;

    public Login(String id, String username, String password, String telphone, String email, Date createTime, String createId, String lastEditorId, Date lastEditorTime, String deletorId, Date deletorTime, String deleted) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.telphone = telphone;
        this.email = email;
        this.createTime = createTime;
        this.createId = createId;
        this.lastEditorId = lastEditorId;
        this.lastEditorTime = lastEditorTime;
        this.deletorId = deletorId;
        this.deletorTime = deletorTime;
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTelphone() {
        return telphone;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public String getLastEditorId() {
        return lastEditorId;
    }

    public Date getLastEditorTime() {
        return lastEditorTime;
    }

    public String getDeletorId() {
        return deletorId;
    }

    public Date getDeletorTime() {
        return deletorTime;
    }

    public String getDeleted() {
        return deleted;
    }
}