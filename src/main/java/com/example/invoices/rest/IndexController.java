package com.example.invoices.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class IndexController {

    @GetMapping(value = "/protected")
    public String ok() {
        return "OK";
    }
}
