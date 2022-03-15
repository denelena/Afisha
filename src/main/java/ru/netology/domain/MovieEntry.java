package ru.netology.domain;

public class MovieEntry {
    private int id;
    private String name;
    private String genre;
    private String imagePath;
    private boolean premiereSoon;

    public MovieEntry(int id, String name, String genre, String imagePath, boolean premiereSoon) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.imagePath = imagePath;
        this.premiereSoon = premiereSoon;
    }
}
