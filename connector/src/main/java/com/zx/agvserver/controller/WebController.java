package com.zx.agvserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zx on 2017/6/6.
 */
@RestController
public class WebController {

    @GetMapping(value = "/")
    public String test() {
        return "Hello AGV Server";
    }
}
