package net.tutorials.udemy.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService{

    @Override
    public String getNewJoke(){
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
