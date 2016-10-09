package com.nirdosh.infrastructure.persistence;

import com.nirdosh.domain.model.devotee.Devotee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DevoteeRepo extends MongoRepository<Devotee, String>{

}
