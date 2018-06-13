package com.wzq.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Created by wzq on 2018/3/8.
 */
@RestController
public class UserController {


    @RequestMapping("/hello")
    public String index(){


        return "hello";
    }

}
