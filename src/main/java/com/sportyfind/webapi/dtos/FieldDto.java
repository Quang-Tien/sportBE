package com.sportyfind.webapi.dtos;


import com.sportyfind.webapi.entities.FieldTypeEntity;
import com.sportyfind.webapi.entities.SportEntity;
import com.sportyfind.webapi.entities.VenueEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FieldDto {
    private Integer fieldId;
    private String fieldName;
    private FieldTypeEntity fieldType;
    private VenueEntity venue;
    private SportEntity sport;
    private double length;
    private double width;
    private double area;
    private double hourlyRate;
}
