package com.example.aopzhujie.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2020/12/21 19:19
 * @Created by meijunjie
 */
@Controller
public class Request  {

    @RequestMapping("/request")
    public void request(@RequestBody String body, Writer writer) throws IOException {
        writer.write(body);
    }

    @RequestMapping("/response")
    @ResponseBody
    public Map<String,Object> response(){
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("param1", "abc");
        return retMap;
    }

}
