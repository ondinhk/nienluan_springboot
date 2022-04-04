package com.ondinhk.nienluan.service;

import java.util.List;

import com.ondinhk.nienluan.model.Dalat;
import com.ondinhk.nienluan.repository.DatlatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DalatServiceimlp implements IDalatService {
    @Autowired
    private DatlatRepository dalatRepository;

    @Override
    public List<Dalat> getAllHouse() {

        return dalatRepository.findAll();
    }

    @Override
    public Dalat addHouse(Dalat houseDalat) {
        if (houseDalat != null) {
            dalatRepository.save(houseDalat);
        }
        return null;
    }

    @Override
    public List<Dalat> getHouseById(Long idHouse) {
        return dalatRepository.findHouseById(idHouse);
    }

}
