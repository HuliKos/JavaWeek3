package com.javaunit3.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {

//    @Autowired
    private Movie movie;

//    @Autowired
//    public BestMovieService(Movie movie) {
//        this.movie = movie;
//    }

//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }

    public Movie getBestMovie() {
        return movie;
    }



}
