package com.sportyfind.webapi.mapper;

import com.sportyfind.webapi.dtos.UserDto;
import com.sportyfind.webapi.dtos.VenueDto;
import com.sportyfind.webapi.entities.UserEntity;
import com.sportyfind.webapi.entities.VenueEntity;

public class VenueMapper {
    public static VenueDto mapToVenueDto(VenueEntity venue){
        VenueDto venueDto = new VenueDto(
                venue.getVenueId(),
                venue.getVenueName(),
                venue.getAddress(),
                venue.getLatitude(),
                venue.getLongitude(),
                venue.getOpeningHour(),
                venue.getClosingHour(),
                venue.getReviews()
        );
        return venueDto;
    }
    public static VenueEntity mapToVenue(VenueDto venueDto){
        VenueEntity venue = new VenueEntity(
                venueDto.getVenueId(),
                venueDto.getVenueName(),
                venueDto.getAddress(),
                venueDto.getLatitude(),
                venueDto.getLongitude(),
                venueDto.getOpeningHour(),
                venueDto.getClosingHour(),
                venueDto.getReviews()
        );
        return venue;
    }
}
