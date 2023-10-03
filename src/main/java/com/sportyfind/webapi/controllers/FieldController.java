package com.sportyfind.webapi.controllers;

import com.sportyfind.webapi.dtos.ErrorResponseDto;
import com.sportyfind.webapi.dtos.FieldDto;
import com.sportyfind.webapi.dtos.SuccessResponseDto;
import com.sportyfind.webapi.entities.FieldEntity;
import com.sportyfind.webapi.repositories.FieldRepository;
import com.sportyfind.webapi.services.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/field")
public class FieldController {

    @Autowired
    private FieldService fieldService;

    @PostMapping("/create")
    public ResponseEntity<Object> createField(@RequestBody FieldDto FieldDto) {
        var status = HttpStatus.OK;
        try {
            var response = new SuccessResponseDto();
            fieldService.save(FieldDto);
            response.result = FieldDto;
            return new ResponseEntity<>(response, status);
        } catch (Exception err) {
            var response = new ErrorResponseDto();
            response.errors = err;
            return new ResponseEntity<>(response, status);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<Object> createField(@RequestBody FieldEntity fieldEntity) {
        var status = HttpStatus.OK;
        try {
            var response = new SuccessResponseDto();
            fieldRepository.save(fieldEntity);
            response.result = fieldEntity;
            return new ResponseEntity<>(response, status);
        } catch (Exception err) {
            var response = new ErrorResponseDto();
            response.errors = err;
            return new ResponseEntity<>(response, status);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<Object> search() {
        var status = HttpStatus.OK;
        try {
            var response = new SuccessResponseDto();
            fieldRepository.save(fieldEntity);
            response.result = fieldEntity;
            return new ResponseEntity<>(response, status);
        } catch (Exception err) {
            var response = new ErrorResponseDto();
            response.errors = err;
            return new ResponseEntity<>(response, status);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<Object> search() {
        var status = HttpStatus.OK;
        try {
            var response = new SuccessResponseDto();
            fieldRepository.save(fieldEntity);
            response.result = fieldEntity;
            return new ResponseEntity<>(response, status);
        } catch (Exception err) {
            var response = new ErrorResponseDto();
            response.errors = err;
            return new ResponseEntity<>(response, status);
        }
    }
}
