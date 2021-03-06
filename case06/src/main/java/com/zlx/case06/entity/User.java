package com.zlx.case06.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: 拉普拉斯妖
 * @Date: 2020/2/23 20:46
 * @Description:  @ApiModel 注解用于实体类，表示对类进行说明，用于参数用实体类接收。
 *                @ApiModelProperty 注解用于类中属性，表示对 model 属性的说明或者数据操作更改。
 */

@ApiModel(value = "用户实体类")
public class User {
    @ApiModelProperty(value = "用户唯一标识")
    private Long id;

    @ApiModelProperty(value = "用户姓名")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }
}
