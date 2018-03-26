package com.liuwill.example.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/26.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/26
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
