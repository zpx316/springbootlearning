package cn.handsome.zp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp
 * @Description:
 * @date 2019-09-05 11:33
 */
@RestController
public class ValueTestController {
    @Value("${name}")
    private String name;
    @Value("${sex}")
    private String sex;
    @Value("${age}")
    private int age;

    @RequestMapping("sayHello")
    public String sayHello() {

        return "姓名：" + name + "，性别：" + sex + ",年龄：" + age;
    }
}