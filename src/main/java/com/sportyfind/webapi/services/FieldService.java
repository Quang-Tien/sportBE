package com.sportyfind.webapi.services;

import com.sportyfind.webapi.dtos.FieldDto;
import com.sportyfind.webapi.entities.FieldEntity;
import com.sportyfind.webapi.mapper.FieldMapper;
import com.sportyfind.webapi.repositories.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldService {

    @Autowired
    FieldRepository fieldRepository;

    public FieldDto save(FieldDto fieldDto) {
        FieldEntity fieldEntity = new FieldEntity();
        fieldEntity = FieldMapper.mapToField(fieldDto);

        FieldEntity savedField = fieldRepository.save(fieldEntity);

        return savedField;
    }
}
