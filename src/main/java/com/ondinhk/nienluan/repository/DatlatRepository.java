package com.ondinhk.nienluan.repository;

import com.ondinhk.nienluan.model.Dalat;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DatlatRepository extends MongoRepository<Dalat, String> {

    @Query("{'idHouse': ?0 }")
    List<Dalat> findHouseById(Long idHouse);

}
