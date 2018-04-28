package net.tutorials.udemy.spring5jokesapp.controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import net.tutorials.udemy.spring5jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        String joke =  jokesService.getNewJoke();
        model.addAttribute("joke",joke);
        return "jokes";
    }
}
