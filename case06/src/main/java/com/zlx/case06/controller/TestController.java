package com.zlx.case06.controller;

import com.zlx.case06.entity.JsonResult;
import com.zlx.case06.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 拉普拉斯妖
 * @Date: 2020/2/23 20:46
 * @Description:  @Api 注解用于类上，表示标识这个类是 swagger 的资源。
 *                @ApiOperation 注解用于方法，表示一个 http 请求的操作。
 *                @ApiParam 注解用于参数上，用来标明参数信息。
 */
@RestController
@RequestMapping("/swagger")
@Api(value = "Swagger2 在线接口文档")
public class TestController {
    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public JsonResult<User> getUserInfo(@PathVariable @ApiParam(value = "用户唯一标识") Long id) {
        // 模拟数据库中根据id获取User信息
        User user = new User(id, "拉普拉斯妖", "123456");
        return new JsonResult(user);
    }

    @PostMapping("/insert")
    @ApiOperation(value = "添加用户信息")
    public JsonResult<Void> insertUser(@RequestBody @ApiParam(value = "用户信息") User user) {
        // 处理添加逻辑
        return new JsonResult<>();
    }
}
