package com.sparkle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author: XuanXiangHui
 * @Date: 2019/11/14 下午7:16
 */
@Controller
@RequestMapping("/phoenix")
public class ATXController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/photo")
    public String photo() {
        return "photo";
    }
}
