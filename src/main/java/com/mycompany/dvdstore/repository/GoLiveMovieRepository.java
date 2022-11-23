package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository {

    public void add(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(movie.getTitle());
            writer.write(" ; ");
            writer.write(movie.getGenre());
            writer.write("\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
