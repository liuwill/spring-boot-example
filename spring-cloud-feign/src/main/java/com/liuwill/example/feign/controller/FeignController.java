package com.liuwill.example.feign.controller;

import com.liuwill.example.feign.service.ComputerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liu Will - liuwill@live.com on 2018/4/3.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/4/3
 * @desc
 */
@RestController
public class FeignController {
    @Autowired
    ComputerServer computerServer;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer x, @RequestParam Integer y) {
        return computerServer.add(x, y);
    }

    @RequestMapping(value = "/area" ,method = RequestMethod.GET)
    public double area(@RequestParam double radius) {
        return computerServer.area(radius);
    }
}
