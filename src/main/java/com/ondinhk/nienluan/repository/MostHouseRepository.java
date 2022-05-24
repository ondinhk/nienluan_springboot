package com.ondinhk.nienluan.repository;

import com.ondinhk.nienluan.model.MostHouse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MostHouseRepository extends MongoRepository<MostHouse,String> {
}
