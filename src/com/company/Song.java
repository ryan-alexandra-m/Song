package com.company;
import java.time.LocalDate;

public class Song {
    String name;
    String artist;
    Genre genre;
    LocalDate creationDate;
    boolean isExplicit;
    int rank; //according to alex :)


    public enum Genre{
        COUNTRY,
        POP,
        INDIE,
        CLASSICAL,
        ALTERNATIVE,
        ROCK
    }

    public Song(String name, String artist, Genre genre, LocalDate creationDate, boolean isExplicit, int rank) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.creationDate = creationDate;
        this.isExplicit = isExplicit;
        this.rank= rank;
    }

    public Song(String name, String artist, int rank) {
        this.name = name;
        this.artist = artist;
        this.rank= rank;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isExplicit() {
        return isExplicit;
    }
    public void setExplicit(boolean explicit) {
        isExplicit = explicit;
    }

    public boolean isTopCharts(){
        return(rank>=10);
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
