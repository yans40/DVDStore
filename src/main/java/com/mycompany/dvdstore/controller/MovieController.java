package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

   public void addUsingController() {

        MovieService movieService = new MovieService();
        Movie movie = new Movie();
        System.out.println("saisir le titre du film :");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        System.out.println("saisir le genre du film :");
        String genre = sc.nextLine();

        movie.setTitle(title);
        movie.setGenre(genre);

        movieService.registerMovie(movie);

    }


}

