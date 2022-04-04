package com.ondinhk.nienluan.controller;

import com.ondinhk.nienluan.model.Images;
import com.ondinhk.nienluan.response.ResponseObject;
import com.ondinhk.nienluan.service.IImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/image/dalat")
public class ImagesController {
    @Autowired
    IImagesService iImagesService;

    @RequestMapping(value = "/{idHouse}")
    ResponseEntity<ResponseObject> findById(@PathVariable(value = "idHouse") Long idHouse) {
        List<Images> linkImage = iImagesService.getByIdHouse(idHouse);
        if (linkImage.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject("Failed", "Not Found by id", ""));
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("Ok", "Query Success", linkImage)
            );
        }
    }
}
