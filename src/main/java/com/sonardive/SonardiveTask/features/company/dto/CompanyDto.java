package com.sonardive.SonardiveTask.features.company.dto;

import com.sonardive.SonardiveTask.features.country.dto.CountryDto;
import lombok.Builder;

@Builder
public record CompanyDto(int id, String name, CountryDto country) {

}
