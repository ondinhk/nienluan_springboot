package com.ondinhk.nienluan.service;

import com.ondinhk.nienluan.model.MostHouse;
import com.ondinhk.nienluan.repository.MostHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostHouseImlp implements IMostHouseService{
    @Autowired
    MostHouseRepository mostHouseRepository;
    @Override
    public List<MostHouse> getAllMostHouse() {
        return mostHouseRepository.findAll();
    }
}
