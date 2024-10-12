package com.gardenrose.shoppaneer.repositories;

import com.gardenrose.shoppaneer.models.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends MongoRepository<Word, String> {
}