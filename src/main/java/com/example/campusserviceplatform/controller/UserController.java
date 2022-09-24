package com.example.campusserviceplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Zousir
 * @email: SloooFish@163.com
 * @date: 2022/9/23 17:51
 */
@Controller
public class UserController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
