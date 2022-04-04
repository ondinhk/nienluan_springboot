package com.ondinhk.nienluan.service;

import com.ondinhk.nienluan.model.Images;

import java.util.List;

public interface IImagesService {
    //    Lấy hình theo id
    List<Images> getByIdHouse(Long idHouse);
}
