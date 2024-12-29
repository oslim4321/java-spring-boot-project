package com.oslim.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService  {
        @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        // System.out.println(movieRepository.findAll().toString());
         List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

   
}
