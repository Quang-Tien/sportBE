package com.sportyfind.webapi.mapper;

import com.sportyfind.webapi.dtos.UserDto;
import com.sportyfind.webapi.entities.UserEntity;

public class UserMapper {

    // Convert User JPA Entity into UserDto
    public static UserDto mapToUserDto(UserEntity user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getRoles(),
                user.getTeams()
        );
        return userDto;
    }

    // Convert UserDto into User JPA Entity
    public static UserEntity mapToUser(UserDto userDto){
        UserEntity user = new UserEntity(
                userDto.getId(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getRoles(),
                userDto.getTeams()
        );
        return user;
    }
}
