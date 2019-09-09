package cn.handsome.zp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @author zp
 * @Description:
 * @date 2019-09-05 19:05
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Map <String, Object> map) {
        map.put("say", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "index/test";

    }
}