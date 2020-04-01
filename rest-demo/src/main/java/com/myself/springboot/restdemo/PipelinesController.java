package com.myself.springboot.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/pipelines")
public class PipelinesController {
    @GetMapping    //Get Method
    public Map<String,Object> pipelines(){
        //Map 类型的示例
    Map<String,Object> lists = new HashMap<>();
//        Calendar calendar =
    lists.put("name","pipeline-1");
    lists.put("author","zhangmiaoyjy");
    return  lists;
    }
}
