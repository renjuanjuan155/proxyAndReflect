package com.example.aopzhujie.data;

import com.example.aopzhujie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo
 * @date 2021/4/1
 */
@RestController
@RequestMapping("/test")
public class DataTestController {

    @Autowired
    private TestService testService;

    public void getDataOne(){

    }
}
