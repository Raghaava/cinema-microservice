package com.example.repository;

import com.example.document.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends MongoRepository<Movie,String>{
    public List<Movie> findByReleaseYearGreaterThanEqual(int year);
}
