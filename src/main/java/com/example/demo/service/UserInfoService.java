package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    private Logger logger= LoggerFactory.getLogger(UserInfoService.class);



    public  UserDto getUserDto(){
        UserDto userDto=new UserDto();
        userDto.setUserName("胡鑫");
        userDto.setId("1");
        logger.info("UserInfoService-getUserDto 出参 ，当前用户:{}",userDto.getUserName());
        return userDto;
    }
}
