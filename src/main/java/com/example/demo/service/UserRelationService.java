package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service("cccc")
public class UserRelationService {
    private static Logger log= LoggerFactory.getLogger(UserRelationService.class);


    public String select(){
        log.info("asdhfkhkash");
//        log.info(("UserRelationService ,入参,用户json:{}",json));
        return "你好";
    }




}
