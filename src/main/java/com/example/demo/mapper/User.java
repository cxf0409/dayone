package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import org.mapstruct.Mapper;


@Mapper
public interface User {

    public void addUser(UserDto userDto);
}
