package com.example.document;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "movies")
public class Movie {
    @Id
    private String id;
    private String title;
    private Double runtime;
    private String format;
    private String plot;
    private int releaseYear;
    private int releaseMonth;
    private int releaseDay;
}

