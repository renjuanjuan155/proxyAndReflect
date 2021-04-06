package com.example.aopzhujie.data;

import com.example.aopzhujie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test")
public class DataTestController {

    @Autowired
    private TestService testService;

    @PostMapping("/getData")
    public void getDataOne(){
        testService.getDataOne();

    }
}
