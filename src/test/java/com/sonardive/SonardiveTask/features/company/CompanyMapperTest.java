package com.sonardive.SonardiveTask.features.company;

import com.sonardive.SonardiveTask.domain.Company;
import com.sonardive.SonardiveTask.domain.Country;
import com.sonardive.SonardiveTask.features.company.dto.CompanyDto;
import com.sonardive.SonardiveTask.features.company.mapper.CompanyMapper;
import com.sonardive.SonardiveTask.features.company.mapper.CompanyMapperImpl;
import com.sonardive.SonardiveTask.features.country.dto.CountryDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CompanyMapperImpl.class})
public class CompanyMapperTest {
    @Autowired
    CompanyMapper companyMapper;

    @Test
    public void testCompanyMapper_Success() {
        Country country = new Country();
        country.setId(1);
        country.setIsoCode("EG");

        Company company = new Company();
        company.setId(1);
        company.setName("Sonardive");
        company.setCountry(country);

        CountryDto expectedCountryDto = new CountryDto(1, "String of EG");

        CompanyDto expectedCompanyDto = new CompanyDto(1, "Sonardive", expectedCountryDto);

        CompanyDto resultCompanyDto = companyMapper.mapCompanyToDto(company);

        Assert.assertEquals(expectedCompanyDto.id(), resultCompanyDto.id());
        Assert.assertEquals(expectedCompanyDto.name(), resultCompanyDto.name());
        Assert.assertEquals(expectedCompanyDto.country().id(), resultCompanyDto.country().id());
        Assert.assertEquals(expectedCompanyDto.country().name(), resultCompanyDto.country().name());

    }
}
