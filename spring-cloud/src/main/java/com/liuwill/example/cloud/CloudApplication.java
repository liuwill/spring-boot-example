package com.liuwill.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/26.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/26
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
// @EnableDiscoveryClient
public class CloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
        // new SpringApplicationBuilder(CloudApplication.class).web(true).run(args);
    }
}
