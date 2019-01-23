package com.zyxr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Autohor: scorpio
 * @Description:
 * @Date: Created in 2019/1/14 0014 下午 18:06
 * @Modified By:
 */

@RestController
public class BaseController {

    @Value("${hello:apollo}")
    private String hello;

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello "+hello;
    }
}
