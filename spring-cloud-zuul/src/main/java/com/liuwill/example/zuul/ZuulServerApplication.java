package com.liuwill.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/30.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/30
 * @desc
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
