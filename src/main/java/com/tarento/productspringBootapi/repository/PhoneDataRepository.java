package com.tarento.productspringBootapi.repository;

import com.tarento.productspringBootapi.model.ProductUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PhoneDataRepository extends MongoRepository<ProductUser, Integer> {
//    List<ProductUser> findByName(String name);

    @Query("{'Specification.value':?0}")
    List<ProductUser> findByValue(String value);

    Optional<ProductUser> findByName(String name);
}
