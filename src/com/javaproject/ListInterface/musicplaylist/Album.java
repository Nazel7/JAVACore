package com.javaproject.ListInterface.musicplaylist;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> albumSong = new ArrayList<>();
    public Album(String name, Song song) {
        this.albumName = name;
        this.albumSong.add(song);
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getAlbumSong() {
        return albumSong;
    }

    public void addSongToAlbum(Song song) {
        this.albumSong.add(song);
        System.out.println("MusicPlayList.Song tittled " + song.getTittle() + " added to album");
    }

    public int findSongIndex(String songName) {
        Song song;
        for (int i = 0; i < this.albumSong.size(); i++) {
            song = this.albumSong.get(i);
            if (song.getTittle().equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    public Song findSong(String songName) {
        Song song;
        for (int i = 0; i < this.albumSong.size(); i++) {
            song = this.albumSong.get(i);
            if (song.getTittle().equals(songName)) {
                return song;
            }
        }
        return null;
    }

    public void printAlbumSong() {
        for (int i = 0; i < this.albumSong.size(); i++) {
            System.out.println(i + 1 + ". " + this.albumSong.get(i).getTittle() + "\n Duration: " +
                    this.albumSong.get(i).getDuration());
        }
    }

    public static Album createNewAlbum(String albumName, Song albumSong) {
        return new Album(albumName, albumSong);
    }
}
