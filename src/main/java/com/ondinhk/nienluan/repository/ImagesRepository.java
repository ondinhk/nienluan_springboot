package com.ondinhk.nienluan.repository;

import com.ondinhk.nienluan.model.Dalat;
import com.ondinhk.nienluan.model.Images;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagesRepository extends MongoRepository<Images, String> {
    //    Query in here
    @Query("{'idHouse': ?0 }")
    List<Images> findImagesById(Long idHouse);
}
