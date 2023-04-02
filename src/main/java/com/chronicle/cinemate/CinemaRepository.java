package com.chronicle.cinemate;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends MongoRepository<Cinema, ObjectId>
{
    Optional<Cinema> findCinemaByImdbId(String imdbId);
}
