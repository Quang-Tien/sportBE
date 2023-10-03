package com.sportyfind.webapi.dtos;


import com.sportyfind.webapi.entities.SportEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FieldTypeDto {
    private Integer fieldTypeId;
    private SportEntity sport;
    private String fieldTypeName;
}
