package ru.netology;

public class MovieEntry {
    public int id;
    public String name;
    public String genre;
    public String imagePath;
    public boolean premiereSoon;

    public MovieEntry(int id, String name, String genre, String imagePath, boolean premiereSoon){
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.imagePath = imagePath;
        this.premiereSoon = premiereSoon;
    }
}
