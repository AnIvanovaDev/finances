package com.global.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oleksandr Ivanov
 * @since 1.0.0
 */
@RestController
public class CustomerController {

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Here your message back " + message;
    }
}
