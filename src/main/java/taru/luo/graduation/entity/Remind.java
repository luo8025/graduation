package taru.luo.graduation.entity;

import lombok.Data;

@Data
public class Remind {
    private String id;
    private String remindId;
    private String remindText;
    private String remindTime;
    private String productId;
    private String status;
    private String deleted;

}
