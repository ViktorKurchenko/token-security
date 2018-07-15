package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class SecuredController {

    @GetMapping("secret")
    public String getSecret() {
        return "Secret!!!";
    }

}
