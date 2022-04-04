package com.ondinhk.nienluan.service;

import java.util.List;
import com.ondinhk.nienluan.model.Dalat;

public interface IDalatService {
    // Lay danh sach house
    List<Dalat> getAllHouse();

    // Them nha tro
    Dalat addHouse(Dalat houseDalat);

    // Tim nha tro bang ID
    List<Dalat> getHouseById(Long idHouse);
}
