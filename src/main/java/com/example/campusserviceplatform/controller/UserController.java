package com.example.campusserviceplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Zousir
 * @email: SloooFish@163.com
 * @date: 2022/9/23 17:51
 */
@RestController
public class UserController {


    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
