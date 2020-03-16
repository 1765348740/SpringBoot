package com.zlx.case16.entity;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/16 17:35
 * @Description:
 */
public class User {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
