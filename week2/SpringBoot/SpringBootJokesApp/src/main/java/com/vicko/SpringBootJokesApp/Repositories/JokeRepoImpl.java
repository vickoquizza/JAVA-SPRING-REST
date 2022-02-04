package com.vicko.SpringBootJokesApp.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Repository
public class JokeRepoImpl implements JokeRepo{


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeRepoImpl(){
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }



    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
