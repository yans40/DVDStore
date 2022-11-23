package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class App {



    public static void main(String[] args) {

        Movie movie = new Movie();
        System.out.println("saisir le titre du film :");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        System.out.println("saisir le genre du film :");
        String genre = sc.nextLine();

        movie.setTitle(title);
        movie.setGenre(genre);

        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);

    }

}
