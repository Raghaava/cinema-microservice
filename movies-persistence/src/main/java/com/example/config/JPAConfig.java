package com.example.config;

import com.google.common.collect.Lists;
import com.example.document.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.example.repository.MoviesRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = MoviesRepository.class)
public class JPAConfig {
    @Bean
    public CommandLineRunner commandLineRunner(MoviesRepository moviesRepository) {
        return args -> moviesRepository.saveAll(Lists.newArrayList(
                Movie.builder().id("1").title("Assasins Creed").format("IMAX").releaseYear(2017).releaseMonth(1).releaseDay(6).build(),
                Movie.builder().id("2").title("Resident Evil: Capitulo Final").format("IMAX").releaseYear(2017).releaseMonth(1).releaseDay(27).build(),
                Movie.builder().id("3").title("xXx: Reactivado").format("IMAX").releaseYear(2019).releaseMonth(1).releaseDay(20).build()
        ));
    }
}
