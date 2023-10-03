package com.sportyfind.webapi.mapper;

import com.sportyfind.webapi.dtos.FieldDto;
import com.sportyfind.webapi.dtos.VenueDto;
import com.sportyfind.webapi.entities.FieldEntity;
import com.sportyfind.webapi.entities.VenueEntity;

public class FieldMapper {
    public static FieldDto mapToFieldDto(FieldEntity field){
        FieldDto fieldDto = new FieldDto(
                field.getFieldId(),
                field.getFieldName(),
                field.getFieldType(),
                field.getVenue(),
                field.getSport(),
                field.getLength(),
                field.getWidth(),
                field.getArea(),
                field.getHourlyRate()
        );
        return fieldDto;
    }
    public static FieldEntity mapToField(FieldDto fieldDto){
        FieldEntity field = new FieldEntity(
                fieldDto.getFieldId(),
                fieldDto.getFieldName(),
                fieldDto.getFieldType(),
                fieldDto.getVenue(),
                fieldDto.getSport(),
                fieldDto.getLength(),
                fieldDto.getWidth(),
                fieldDto.getArea(),
                fieldDto.getHourlyRate()
        );
        return field;
    }
}
