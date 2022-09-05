package com.qf.ec.category.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("商品分类api")
@Slf4j      //log
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/list")
    public String list(){
        return "测试list";
    }
}
