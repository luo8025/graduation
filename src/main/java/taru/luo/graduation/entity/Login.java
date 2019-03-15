package taru.luo.graduation.entity;

import lombok.Data;

import java.util.Date;
@Data
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
}