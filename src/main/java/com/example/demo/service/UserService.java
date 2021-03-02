package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 增加用户
 */
@Service
public class UserService {

    List<UserDto> list;
    public UserService(){
        list=new ArrayList<UserDto>();
        list.add(new UserDto("1","胡鑫"));
//        list.add(new UserDto("2","陈小飞"));
    }


    private Logger logger= LoggerFactory.getLogger(UserInfoService.class);

    /**
     * 传入一个用户对象
     * @param userDto
     * @return
     */
    public List<UserDto> addUser(UserDto userDto){
        list.add(userDto);
        logger.info("AddService-addUser,入参,当前用户:{}",list);
        return list;
    }


    @GetMapping("Update")
    public List update(String id ,String userName){
        for (UserDto user:list
             ) {
            if(user.getId()==id){
                logger.info("AddService-update,入参,当前用户:{}",user);
                user.setUserName(userName);

            }
        }
        return list;
    }

    @GetMapping("SelectByid")
    public UserDto selectByid(String id){
        for (UserDto user:list
        ) {
            if(user.getId()==id){
                logger.info("AddService-update,入参,当前用户:{}",user);
                return user;
            }
        }
        return null;
    }
    @GetMapping("SelectAll")
    public List selectAll(){
        logger.info("AddService-selectAll,入参,当前用户:{}",list);
        return list;
    }

    public List delete(String id){
        for (int i=list.size()-1;i>=0;i--){
            if(list.get(i).getId()==id){
                list.remove(i);
            }
        }
        logger.info("AddService-delete,入参,当前用户:{}",list);
        return list;
    }

}
