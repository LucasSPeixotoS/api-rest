package com.lpeixoto.springproject.controllers;

import com.lpeixoto.springproject.dto.GameDTO;
import com.lpeixoto.springproject.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameDTO> findAll(){
        return gameService.findAll();
    }

}
