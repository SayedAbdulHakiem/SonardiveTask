package com.sonardive.SonardiveTask.features.country.service;

import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    @Override
    public String getName(String isoCode) {
        return "String of " + isoCode;
    }
}
