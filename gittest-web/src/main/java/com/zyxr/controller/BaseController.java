package com.zyxr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Autohor: scorpio
 * @Description:
 * @Date: Created in 2019/1/14 0014 下午 18:06
 * @Modified By:
 */
@RestController
public class BaseController {

    @GetMapping("hello")
    public String hello(){
        return "Hello!!!";
    }
}
