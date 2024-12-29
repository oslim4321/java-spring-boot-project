package com.oslim.movies;

// import java.sql.Date;
// import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findMovieByImdbId(String id);
    // Optional<Movie> findMovieByReleaseDate(String id);
    // List<Movie> findMoviesByReleaseDate(String id);


}
