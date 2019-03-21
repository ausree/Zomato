package com.thinkxfactor.zomatoplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")

public class OrderController {

	@GetMapping("/order")
    public String hello() {
        return "Hello order!!!";
    }
	
}
