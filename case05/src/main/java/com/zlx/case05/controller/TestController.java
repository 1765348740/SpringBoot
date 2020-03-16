package com.zlx.case05.controller;

import com.zlx.case05.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author 拉普拉斯妖
 * @Date: 2020/2/23 19:14
 * @Description:
 */
@RestController

@RequestMapping(value = "/test", produces = "application/json; charset=UTF-8")

      /*  * value 属性：指定请求的实际地址，value 可以省略不写
          * method 属性：指定请求的类型，主要有 GET、PUT、POST、DELETE，默认为 GET
          * produces属性：指定返回内容类型，如 produces = "application/json; charset=UTF-8"*/

      public class TestController {
    /**
     * 测试@RequestMapping
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGet() {
        return "success";
    }

    /**
     * 测试@Pathvariable注解，一个参数
     * @param id
     * @return
     */

    @GetMapping("/user/{idd}")
    public String testPathVariable(@PathVariable(value = "idd") Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    /**
     * 测试@Pathvariable注解，多个参数
     * @param id
     * @return
     */
    @GetMapping("/user/{idd}/{name}")
    public String testPathVariable(@PathVariable(value = "idd") Integer id, @PathVariable String name) {
        System.out.println("获取到的id为：" + id);
        System.out.println("获取到的name为：" + name);
        return "success";
    }

    /**
     * 测试@RequestParam注解
     * @param id
     * @return
     */
    /*@RequestParam 和 @PathVariable 有什么不同呢？
    主要区别在于： @PathValiable 是从 url 模板中获取参数值，
    即这种风格的 url：http://localhost:8080/user/{id} ；
    而 @RequestParam 是从 request 里面获取参数值，
    即这种风格的 url：http://localhost:8080/user?id=1 */
    @GetMapping("/user")
    public String testRequestParam(@RequestParam Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    /**
     * 测试@RequestBody注解
     * @param user
     * @return
     */
    @PostMapping("/user")
    public String testRequestBody(@RequestBody User user) {
        System.out.println("获取到的username为：" + user.getUsername());
        System.out.println("获取到的password为：" + user.getPassword());
        return "success";
    }

    /**
     * 测试@RequestParam多个参数（表单提交）
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/form1")
    public String testForm(@RequestParam String username, @RequestParam String password) {
        System.out.println("获取到的username为：" + username);
        System.out.println("获取到的password为：" + password);
        return "success";
    }

    /**
     * 测试表单提交，接收实体前不能加@RequestBody注解
     * @param user
     * @return
     */
    @PostMapping("/form2")
    public String testForm(User user) {
        System.out.println("获取到的username为：" + user.getUsername());
        System.out.println("获取到的password为：" + user.getPassword());
        return "success";
    }



}
