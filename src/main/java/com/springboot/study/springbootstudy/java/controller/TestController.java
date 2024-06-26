package com.springboot.study.springbootstudy.java.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Test", description = "Test API")
@RequestMapping("/test")
public class TestController {

    @Operation(summary = "테스트", description = "테스트 API")
    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }

}