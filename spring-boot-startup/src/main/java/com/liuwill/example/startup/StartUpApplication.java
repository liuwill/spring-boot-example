package com.liuwill.example.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/24.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/24
 * @desc
 */
@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class StartUpApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartUpApplication.class);
    }

    @RequestMapping("/demo")
    public Object showHelloWorld() {
        return new HashMap<String, String>() {{
            put("message", "hello spring boot");
        }};
    }

    @RequestMapping(
        value = "/echo",
        method = {RequestMethod.GET, RequestMethod.POST},
        consumes = {MediaType.ALL_VALUE})
    public Map echo(@RequestBody HashMap<Object, Object> reqBody) {
        return reqBody;
    }
}
