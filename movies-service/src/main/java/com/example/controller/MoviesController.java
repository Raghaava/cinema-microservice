package com.example.controller;

import com.example.document.Movie;
import com.example.repository.MoviesRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MoviesController {

    @Autowired
    MoviesRepository moviesRepository;

    @GetMapping("/")
    public List<Movie> getMovies() {
        return Lists.newArrayList(moviesRepository.findAll());
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable String id) {
      return moviesRepository.findById(id).orElse(null);
    }

    @GetMapping("/premier")
    public List<Movie> getMoviePremier() {
        return moviesRepository.findByReleaseYearGreaterThanEqual(Calendar.getInstance().get(Calendar.YEAR));
    }
}
