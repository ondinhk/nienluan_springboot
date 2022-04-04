package com.ondinhk.nienluan.controller;

import java.util.List;

import com.ondinhk.nienluan.model.Comments;
import com.ondinhk.nienluan.model.Dalat;
import com.ondinhk.nienluan.model.Images;
import com.ondinhk.nienluan.response.ResponseObject;
import com.ondinhk.nienluan.response.ResponseHouse;
import com.ondinhk.nienluan.service.ICommentsService;
import com.ondinhk.nienluan.service.IDalatService;

import com.ondinhk.nienluan.service.IImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/house/dalat")
public class Info_House {
    @Autowired
    IDalatService dalatService;
    @Autowired
    IImagesService imagesService;
    @Autowired
    ICommentsService commentsService;

    @RequestMapping("/all")
    ResponseEntity<ResponseObject> findAll() {
        List<Dalat> dalatList = dalatService.getAllHouse();
        if (!dalatList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("Ok", "Query Successfully", dalatList));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject("Failed", "Cannot find enything", ""));
        }
    }

    @RequestMapping("/{idHouse}")
    ResponseEntity<ResponseHouse> finById(@PathVariable(value = "idHouse") Long idHouse) {
        List<Dalat> house = dalatService.getHouseById(idHouse);
        List<Images> imagesList = imagesService.getByIdHouse(idHouse);
        List<Comments> commentsList = commentsService.getComment(idHouse);
        if (!house.isEmpty() && !imagesList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseHouse("Ok", "Query Successfully", house, imagesList,commentsList));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseHouse("Failed", "Cannot find house by id " + idHouse, "", "",""));
        }
    }


}
