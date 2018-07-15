package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/public/")
public class PublicController {

    @GetMapping("config")
    public String getConfig() {
        return "config.json";
    }

}
