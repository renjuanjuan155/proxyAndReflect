package com.example.aopzhujie.controller;

import com.example.aopzhujie.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo
 * @date 2021/2/1
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private ReportService service;

    @RequestMapping(value = "getData",method = RequestMethod.POST)
    public void getData(){
        service.insert();
    }
}
