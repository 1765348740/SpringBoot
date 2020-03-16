package com.zlx.case11.service.serviceimpl;

import com.zlx.case11.dao.UserMapper;
import com.zlx.case11.entity.User;
import com.zlx.case11.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/2/24 17:01
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserMapper userMapper;


    @Override
    @Transactional
    public void isertUser(User user) {
        // 插入用户信息
        userMapper.insertUser(user);
      /*  在 service 层，我们手动抛出个异常来模拟实际中出现的异常，然后观察一下事务有没有回滚，
        如果数据库中没有新的记录，则说明事务回滚成功。*/
        // 手动抛出异常
        throw new RuntimeException();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void isertUser2(User user) throws Exception {
        // 插入用户信息
        userMapper.insertUser(user);
        // 手动抛出异常
      /*  Spring Boot 默认的事务规则是遇到运行异常（RuntimeException）和程序错误（Error）才会回滚。
        比如上面我们的例子中抛出的 RuntimeException 就没有问题，但是抛出 SQLException 就无法回滚了。
        针对非运行时异常，如果要进行事务回滚的话，可以在 `@Transactional` 注解中使用 `rollbackFor`
        属性来指定异常，比如 `@Transactional(rollbackFor = Exception.class)`，这样就没有问题了，
        所以在实际项目中，一定要指定异常*/
        throw new SQLException("数据库异常");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void isertUser3(User user) {
        try {
            // 插入用户信息
            userMapper.insertUser(user);
            // 手动抛出异常
            throw new SQLException("数据库异常");
        } catch (Exception e) {
            // 异常处理逻辑
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public synchronized void isertUser4(User user) {
        // 插入用户信息
        userMapper.insertUser(user);
    }
}
