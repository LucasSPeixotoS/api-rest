package com.lpeixoto.springproject.controllers;

import com.lpeixoto.springproject.dto.GameDTO;
import com.lpeixoto.springproject.dto.GameMinInfoDTO;
import com.lpeixoto.springproject.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping(value = "{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinInfoDTO> findAll() {
        return gameService.findAll();
    }

}
