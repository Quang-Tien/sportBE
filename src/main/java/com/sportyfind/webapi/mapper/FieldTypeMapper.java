package com.sportyfind.webapi.mapper;

import com.sportyfind.webapi.dtos.FieldTypeDto;
import com.sportyfind.webapi.dtos.VenueDto;
import com.sportyfind.webapi.entities.FieldTypeEntity;
import com.sportyfind.webapi.entities.VenueEntity;

public class FieldTypeMapper {
    public static FieldTypeDto mapToFieldTypeDto(FieldTypeEntity fieldType){
        FieldTypeDto fieldTypeDto = new FieldTypeDto(
                fieldType.getFieldTypeId(),
                fieldType.getSport(),
                fieldType.getFieldTypeName()
        );
        return fieldTypeDto;
    }
    public static FieldTypeEntity mapToFieldType(FieldTypeDto fieldTypeDto){
        FieldTypeEntity fieldType = new FieldTypeEntity(
                fieldTypeDto.getFieldTypeId(),
                fieldTypeDto.getSport(),
                fieldTypeDto.getFieldTypeName()
        );
        return fieldType;
    }
}
