package com.sportyfind.webapi.dtos;


import com.sportyfind.webapi.entities.UserEntity;
import com.sportyfind.webapi.entities.VenueEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReviewDto {
    private int reviewId;
    private VenueEntity venue;
    private UserEntity customer;
    private LocalDateTime createdDate;
    private double score;
    private String review;
}
