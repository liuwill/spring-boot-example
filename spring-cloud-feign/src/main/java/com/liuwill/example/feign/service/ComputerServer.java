package com.liuwill.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Liu Will - liuwill@live.com on 2018/4/3.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/4/3
 * @desc
 */
@FeignClient(value = "demo-service")
public interface ComputerServer {
    @RequestMapping(value = "/area",method = RequestMethod.GET)
    double area(@RequestParam(value = "radius") double radius);

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam(value = "x") Integer x, @RequestParam(value = "y") Integer y);
}
