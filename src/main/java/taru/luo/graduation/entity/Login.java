package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class Login {
    private String id;

    private String username;

    private String password;

    private String telephone;

    private String email;

    private String deleted;
}