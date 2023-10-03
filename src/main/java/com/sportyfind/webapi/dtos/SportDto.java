package com.sportyfind.webapi.dtos;


import com.sportyfind.webapi.entities.FieldEntity;
import com.sportyfind.webapi.entities.FieldTypeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SportDto {
    private Integer sportId;
    private String sportName;
    private List<FieldTypeEntity> fieldTypes;
    private List<FieldEntity> fields;
}
