package com.lpeixoto.springproject.dto;

import com.lpeixoto.springproject.entities.Game;
import jakarta.persistence.Column;

public class GameDTO {

    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.genre = game.getGenre();
        this.platforms = game.getPlatforms();
        this.score = game.getScore();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
        this.longDescription = game.getLongDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
