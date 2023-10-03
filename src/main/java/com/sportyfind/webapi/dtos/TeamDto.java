package com.sportyfind.webapi.dtos;


import com.sportyfind.webapi.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamDto {
    private int id;
    private String name;
    private int size;
    private String description;
    private int skilllevel;
    private int rankingpoint;
    private String logo;
    private long rankingorder;
    private UserEntity captain;
}
