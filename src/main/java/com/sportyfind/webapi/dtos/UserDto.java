package com.sportyfind.webapi.dtos;


import com.sportyfind.webapi.entities.RoleEntity;
import com.sportyfind.webapi.entities.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private List<RoleEntity> roles;
    private List<TeamEntity> teams;
}
