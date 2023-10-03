package com.sportyfind.webapi.mapper;

import com.sportyfind.webapi.dtos.FieldTypeDto;
import com.sportyfind.webapi.dtos.SportDto;
import com.sportyfind.webapi.entities.FieldTypeEntity;
import com.sportyfind.webapi.entities.SportEntity;

public class SportMapper {
    public static SportDto mapToSportDto(SportEntity sport){
        SportDto sportDto = new SportDto(
                sport.getSportId(),
                sport.getSportName(),
                sport.getFieldTypes(),
                sport.getFields()
        );
        return sportDto;
    }
    public static SportEntity mapToSport(SportDto sportDto){
        SportEntity sport = new SportEntity(
                sportDto.getSportId(),
                sportDto.getSportName(),
                sportDto.getFieldTypes(),
                sportDto.getFields()
        );
        return sport;
    }
}
