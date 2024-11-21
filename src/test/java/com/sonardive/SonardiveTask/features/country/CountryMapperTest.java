package com.sonardive.SonardiveTask.features.country;

import com.sonardive.SonardiveTask.domain.Country;
import com.sonardive.SonardiveTask.features.country.dto.CountryDto;
import com.sonardive.SonardiveTask.features.country.mapper.CountryMapper;
import com.sonardive.SonardiveTask.features.country.mapper.CountryMapperImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CountryMapperImpl.class})
public class CountryMapperTest {

    CountryMapper countryMapper = CountryMapper.INSTANCE;

    @Test
    public void testCompanyMapper_Success() {
        Country country = new Country();
        country.setId(1);
        country.setIsoCode("EG");
        CountryDto expectedCountryDto = new CountryDto(1, "String of EG");
        CountryDto resultCountryDto = countryMapper.mapCountryToDto(country);

        Assert.assertEquals(expectedCountryDto.id(), resultCountryDto.id());
        Assert.assertEquals(expectedCountryDto.name(), resultCountryDto.name());
    }
}
