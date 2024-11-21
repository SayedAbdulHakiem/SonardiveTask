package com.sonardive.SonardiveTask.features.country.mapper;

import com.sonardive.SonardiveTask.domain.Country;
import com.sonardive.SonardiveTask.features.country.dto.CountryDto;
import com.sonardive.SonardiveTask.features.country.service.CountryService;
import com.sonardive.SonardiveTask.features.country.service.CountryServiceImpl;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
    @Autowired
    CountryService countryService = new CountryServiceImpl();

    @Mapping(target = "name", expression = "java( countryService.getName(country.getIsoCode()) )")
    CountryDto mapCountryToDto(Country country);
}
