package com.tatek.jdbcAuthentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NoticeController {

    @GetMapping("/notice")
    public String myAccount(){
        return "Notice Details: ";
    }
}
