package com.sportyfind.webapi.dtos;

import com.sportyfind.webapi.entities.ReviewEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VenueDto {
    private Integer venueId;
    private String venueName;
    private String address;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Time openingHour;
    private Time closingHour;
    private List<ReviewEntity> reviews;
}
