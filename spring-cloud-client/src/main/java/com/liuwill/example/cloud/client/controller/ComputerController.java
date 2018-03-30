package com.liuwill.example.cloud.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RestController
public class ComputerController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer x, @RequestParam Integer y) {
        // ServiceInstance instance = null;// client.getI.getLocalServiceInstance();
        Integer result = x + y;
        // logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return result;
    }

    @RequestMapping(value = "/area" ,method = RequestMethod.GET)
    public double area(@RequestParam double raduis) {
        // ServiceInstance instance = null;// client.getI.getLocalServiceInstance();
        double area = Math.PI * Math.pow(raduis, 2);
        // logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return area;
    }

    @Value("${author}")
    String author;

    @RequestMapping(value = "/author")
    public String hi(){
        return author;
    }
}
