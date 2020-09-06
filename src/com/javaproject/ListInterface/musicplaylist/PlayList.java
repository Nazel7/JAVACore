package com.javaproject.ListInterface.musicplaylist;

import java.util.LinkedList;
import java.util.Scanner;

public class PlayList {
    private static AlbumList albumList = new AlbumList();

    public static void main(String[] args) {
        System.out.println( 0+ ". Switching off device\n" +1+ ". addAlbum\n" +2+ ". addSongToAlbum\n" +
                3+ ". addSongToPlayList\n"+4+ ". PlaySong\n"+ 5+ ". removeSongFromPlayList\n"+ 6+ ". deleteAlbum\n" +
                7+ ". printAlbumSong\n"+ 8+ ".  printPlayList\n"+ 9+ ". printOptionToPress");
        Scanner input= new Scanner(System.in);
        boolean quitPlayList= false;
        while(!quitPlayList){
            System.out.println("Press operation to perform: ");
            int press= input.nextInt();
            switch (press){
                case 0:
                    System.out.println("Switching off device...");
                    quitPlayList= true;
                    break;
                case 1:
                    addAlbum();
                    break;
                case 2:
                    addSongToAlbum();
                    break;
                case 3:
                    addSongToPlayList();
                    break;
                case 4:
                    playSong();
                    break;
                case 5:
                    removeSongFromPlayList();
                    break;
                case 6:
                    deleteAlbum();
                    break;
                case 7:
                    printAlbumSong();
                    break;
                case 8:
                    printPlayList();
                    break;
                case 9:
                    printOptionToPress();
                    break;
            }
        }
    }

    public static void addAlbum() {
        Scanner scanAlbum = new Scanner(System.in);
        System.out.println("Enter album name: ");
        String albumName = scanAlbum.nextLine();
        int findAlbumName = albumList.findAlbum(albumName);
        if (findAlbumName < 0) {
            System.out.println("Enter MusicPlayList.Song name: ");
            String songName = scanAlbum.nextLine();
            int findSongName = albumList.findSongInPlayList(songName);
            if (findSongName < 0) {
                System.out.println("Enter MusicPlayList.Song Duration: ");
                String songDuration = scanAlbum.nextLine();
                Song newSong = Song.createNewSong(songName, songDuration);
                Album newAlbum = Album.createNewAlbum(albumName, newSong);
                albumList.addAlbum(newAlbum);
            }
        }
    }

    public static void deleteAlbum() {
        Scanner scanAlbum = new Scanner(System.in);
        System.out.println("Enter album name: ");
        String albumName = scanAlbum.nextLine();
        int findAlbumName = albumList.findAlbum(albumName);
        if (findAlbumName >= 0) {
            albumList.deleteAlbum(albumName);
        }
    }

    public static void addSongToAlbum() {
        Scanner scanSongName = new Scanner(System.in);
        System.out.println("Enter new MusicPlayList.Song name: ");
        String newSongName = scanSongName.nextLine();
        albumList.addSongToAlbum(newSongName);
    }

    public static void addSongToPlayList() {
        Scanner scanSongName = new Scanner(System.in);
        System.out.println("Enter new MusicPlayList.Song name: ");
        String songName = scanSongName.nextLine();
        albumList.addSongToPlayList(songName);
    }

    public static void playSong(){
        LinkedList<Song> songLinkedList= albumList.getSongLinkedList();
        albumList.playSong(songLinkedList);

    }

    public static void removeSongFromPlayList(){
        Scanner scanSongName = new Scanner(System.in);
        System.out.println("Enter new MusicPlayList.Song name: ");
        String songName = scanSongName.nextLine();
        albumList.removeSongFromPlayList(songName);
    }
    public static  void printAlbumSong(){
        albumList.printAlbumSong();
    }
    public static void printOptionToPress(){
        System.out.println( 0+ ". Switching off device\n" +1+ ". addAlbum\n" +2+ ". addSongToAlbum\n" +
                3+ ". addSongToPlayList\n"+4+ ". PlaySong\n"+ 5+ ". removeSongFromPlayList\n"+ 6+ ". deleteAlbum\n" +
                7+ ". printAlbumSong\n"+ 8+ ".  printPlayList\n"+ 9+ ". printOptionToPress");
    }
    public static void printPlayList(){
        albumList.printPlayList();
    }
}
