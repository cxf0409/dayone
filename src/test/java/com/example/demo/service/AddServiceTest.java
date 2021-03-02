package com.example.demo.service;

import com.example.demo.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddServiceTest {

    @Autowired
    private UserService addService;
    @Test
    void addUser() {
        UserDto userDto=new UserDto();
        userDto.setId("3");
        userDto.setUserName("cxf");
        List<UserDto> list=addService.addUser(userDto);
        for (UserDto user:
             list) {
            System.out.println(user);
        }

    }
    @Test
    void update() {
        String id="5";
        String userName="张三";
        List<UserDto> list=addService.update(id,userName);
        for (UserDto user:
                list) {
            System.out.println(user);
        }
    }

    @Test
    void selectByid() {
        String id="1";
        UserDto userDto=addService.selectByid(id);
        System.out.println(userDto);
    }

    @Test
    void selectAll() {
        List<UserDto> list=addService.selectAll();
        for (UserDto user:
                list) {
            System.out.println(user);
        }
    }

    @Test
    void delete() {
        String id="1";
        List<UserDto> list=addService.delete(id);
        for (UserDto user:
                list) {
            System.out.println(user);
        }
    }
}