package com.example.demo.Restcontroller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserInfoService;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserDtoController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    private Logger logger= LoggerFactory.getLogger(UserDtoController.class);


    @GetMapping("Username")
    public UserInfoService userName(){
        logger.info("UserDtoController-Username 当前用户:{}");
        return userInfoService;
    }

    @GetMapping("addUser")
    public List<UserDto> addUSer(){
        logger.info("UserDtoController-addUSer 当前用户:{}");
        UserDto userDto=new UserDto("2","hx");
        return userService.addUser(userDto);
    }

    @GetMapping("update")
    public List<UserDto> update() {
        String id="1";
        String userName="张三";
        List<UserDto> list=userService.update(id,userName);
        return list;
    }

    @GetMapping("selectByid")
    public UserDto selectByid() {
        String id="1";
        UserDto userDto=userService.selectByid(id);
        System.out.println(userDto);
        return userDto;
    }

    @GetMapping("selectAll")
    public  List<UserDto> selectAll() {
        List<UserDto> list=userService.selectAll();
        for (UserDto user:
                list) {
            System.out.println(user);
        }
        return list;
    }

    @GetMapping("delete")
   public List<UserDto> delete() {
        String id="1";
        List<UserDto> list=userService.delete(id);
        for (UserDto user:
                list) {
            System.out.println(user);
        }
        return list;
    }

}
