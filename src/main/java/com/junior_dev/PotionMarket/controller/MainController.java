package com.junior_dev.PotionMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "안녕하세요, 환영합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/item/list";
    }
}
