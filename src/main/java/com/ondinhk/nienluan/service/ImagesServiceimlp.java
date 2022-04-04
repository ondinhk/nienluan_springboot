package com.ondinhk.nienluan.service;

import com.ondinhk.nienluan.model.Images;
import com.ondinhk.nienluan.repository.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagesServiceimlp implements IImagesService {
    @Autowired
    private ImagesRepository imagesRepository;

    @Override
    public List<Images> getByIdHouse(Long idHouse) {
        return imagesRepository.findImagesById(idHouse);
    }
}
