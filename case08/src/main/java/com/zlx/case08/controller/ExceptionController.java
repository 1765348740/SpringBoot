package com.zlx.case08.controller;

import com.zlx.case08.entity.JsonResult;
import com.zlx.case08.exception.BusinessErrorException;
import com.zlx.case08.exception.BusinessMsgEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/2/24 15:28
 * @Description:
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    /*在日志输出的时候，可以打印出日志信息所在的类*/
    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @GetMapping("/null")
    public JsonResult testNullPointException(){
        String str = null;
        str.length();
        return new JsonResult();
    }

    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name,
                           @RequestParam("pass") String pass) {

        logger.info("name：{}", name);
        logger.info("pass：{}", pass);
        return new JsonResult();
    }

    @GetMapping("/business")
    public JsonResult testException() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            throw new BusinessErrorException(BusinessMsgEnum.UNEXPECTED_EXCEPTION);
        }
        return new JsonResult();
    }

}
