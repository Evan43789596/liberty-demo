package com.eshare.liberty.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangyh on 2018/10/20.
 * Email:10856214@163.com
 */
@RestController
public class IndexController{

        @RequestMapping("/sayHello/{name}")
        public String sayHello(@PathVariable String name) {
            return "hello," + name;
        }

}
