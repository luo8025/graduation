package taru.luo.graduation.entity;

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

    public UserInfo(String id, String username, String photo, String telphone, String email, String sex, String age, String address, String deleted) {
        this.id = id;
        this.username = username;
        this.photo = photo;
        this.telphone = telphone;
        this.email = email;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTelphone() {
        return telphone;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDeleted() {
        return deleted;
    }
}