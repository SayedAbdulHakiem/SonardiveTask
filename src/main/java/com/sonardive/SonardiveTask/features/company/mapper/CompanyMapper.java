package com.sonardive.SonardiveTask.features.company.mapper;

import com.sonardive.SonardiveTask.domain.Company;
import com.sonardive.SonardiveTask.features.company.dto.CompanyDto;
import com.sonardive.SonardiveTask.features.country.mapper.CountryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {CountryMapper.class})
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    @Mapping(target = "country", expression = "java(CountryMapper.INSTANCE.mapCountryToDto(company.getCountry() ) )")
    CompanyDto mapCompanyToDto(Company company);
}
