package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class Merchant {
    private String id;

    private String merchantName;

    private String merchantPassword;

    private String deleted;
}
