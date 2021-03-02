package com.example.demo.Restcontroller;

import com.example.demo.service.UserRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloeWorld {

    private static Logger log= LoggerFactory.getLogger(UserRelationService.class);

    @Value("${avatarPath}")
    private String name;
    @Autowired
    private UserRelationService cccc;
    @GetMapping("index")
    public String index(){

        log.info("HelloeWorld-index-用于测试info日志");
        log.debug("HelloeWorld-index-用于测试debug日志");
        log.error("HelloeWorld-index-用于测试error日志");
        return name;
    }
//    @GetMapping("run")
//    public String run(){
//        return cccc.select();
//    }
}
