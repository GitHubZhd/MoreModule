package com.web.app.controller;

import com.hd.web.service.SimpleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ps on 2017/10/20.
 */
@RestController
public class AppController {

    @RequestMapping("/app/test")
    public String apply(){

        System.out.println(SimpleService.getService());
        return "";
    }
}
