package com.liuwill.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *   _____      _       ____      ____  _   __   __
 * |_   _|    (_)     |_  _|    |_  _|(_) [  | [  |
 * | |      __  __   _\ \  /\  / /  __   | |  | |
 * | |   _ [  |[  | | |\ \/  \/ /  [  |  | |  | |
 * _| |__/ | | | | \_/ |,\  /\  /    | |  | |  | |
 * |________|[___]'.__.'_/ \/  \/    [___][___][___]
 *
 * Created by Liu Will - liuwill@live.com on 2018/3/24.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/24
 * @desc
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class);
    }
}
