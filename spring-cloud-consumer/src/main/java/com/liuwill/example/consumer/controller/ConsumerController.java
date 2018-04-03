package com.liuwill.example.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/26.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/26
 * @desc
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://DEMO-SERVICE/add?x=10&y=20", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "/area", method = RequestMethod.GET)
    public String area() {
        return restTemplate.getForEntity("http://DEMO-SERVICE/area?radius=4", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return restTemplate.getForEntity("http://DEMO-SERVICE/hello?name=will", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "/wow", method = RequestMethod.GET)
    public String wow() {
        return restTemplate.getForEntity("http://DEMO-SERVICE/wow?name=will", String.class).getBody();
    }

    public String hiError() {
        return "hi,sorry,error!";
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
