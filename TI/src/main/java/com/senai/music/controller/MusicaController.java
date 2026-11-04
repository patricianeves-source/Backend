package com.senai.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicaController {

    @GetMapping
    public String tocarMusica(){
        return "Tocando Jesus Choorou";
    }
}
