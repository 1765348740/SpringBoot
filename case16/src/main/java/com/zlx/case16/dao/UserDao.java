package com.zlx.case16.dao;

import com.zlx.case16.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/16 17:46
 * @Description:
 */
public interface UserDao {
    @Select("select * from t_user where username = #{username}")
    User getByUsername(String username);

    @Select("select r.rolename from t_user u,t_role r " +
            "where u.role_id = r.id and u.username = #{username}")
    Set<String> getRoles(String username);

    @Select("select p.permissionname from t_user u,t_role r,t_permission p " +
            "where u.role_id = r.id and p.role_id = r.id and u.username = #{username}")
    Set<String> getPermissions(String username);

}
