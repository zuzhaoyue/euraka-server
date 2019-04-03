package com.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zuzhaoyue on 2019/4/2.
 */
@RestController
public class HelloController {

    @GetMapping
    public Object hello(){
        return "hi zzy ";
    }

}
