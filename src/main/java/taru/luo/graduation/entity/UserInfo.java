package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class UserInfo {
    private String id;

    private String username;

    private String photo;

    private String telphone;

    private String email;

    private String sex;

    private String age;

    private String address;

    private String deleted;
}