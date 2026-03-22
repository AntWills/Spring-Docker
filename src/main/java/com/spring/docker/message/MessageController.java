package com.spring.docker.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class MessageController {
    @GetMapping("/ping")
    public String ping(){
        return "PING!";
    }
}
