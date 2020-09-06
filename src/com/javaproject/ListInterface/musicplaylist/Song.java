package com.javaproject.ListInterface.musicplaylist;

public class Song  {
    private String tittle, duration;

    public Song(String tittle, String duration) {
        this.tittle = tittle;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDuration() {
        return duration;
    }

    public static Song createNewSong(String tittle, String duration) {
        return new Song(tittle, duration);

    }


}
