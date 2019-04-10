package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class User {
    private String id;

    private String username;

    private String photo;

    private String telephone;

    private String email;

    private String address;

    private String classes;

    private String deleted;
}