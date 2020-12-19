package com.javaproject.ListInterface.musicplaylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class AlbumList {
    private ArrayList<Album> albumList;
    private LinkedList<Song> songLinkedList = new LinkedList<>();
    private Song currentSong;

    public AlbumList() {
        this.albumList = new ArrayList<>();
    }

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public LinkedList<Song> getSongLinkedList() {
        return songLinkedList;
    }

    public int findAlbum(String albumName) {
        Album album;
        for (int i = 0; i < this.albumList.size(); i++) {
            album = this.albumList.get(i);
            if (album.getAlbumName().equals(albumName)) {
                return i;
            }
        }
        return -1;
    }

    private void skipForward2(ListIterator<Song> listIterator) {
        if(listIterator.hasNext()) {
            Song tb = listIterator.next();
            if (currentSong != null && tb.getTittle().equals(currentSong.getTittle())) currentSong = listIterator.next();
            else currentSong = tb;
        }

        System.out.println("Now playing next MusicPlayList.Song "
                + currentSong.getTittle() + "\n MusicPlayList.Song Duration: " + currentSong.getDuration());
    }



    private void skipBackward2(ListIterator<Song> listIterator) {
        if (listIterator.hasPrevious()) {
            Song tb = listIterator.previous();
            if (currentSong != null && tb.getTittle().equals(currentSong.getTittle())) currentSong = listIterator.previous();
            else currentSong = tb;
        }
        System.out.println("Now playing previous MusicPlayList.Song "
                + currentSong.getTittle() + "\n MusicPlayList.Song Duration: " + currentSong.getDuration());
    }

    private void replaySong() {
        System.out.println("Now replaying current MusicPlayList.Song "
                + currentSong.getTittle() + "\n MusicPlayList.Song Duration: " + currentSong.getDuration());
    }


    public void addAlbum(Album album) {
        Scanner scanSong = new Scanner(System.in);
        int findAlbum = findAlbum(album.getAlbumName());
        if (findAlbum >= 0) {
            System.out.println("MusicPlayList.Album " + album.getAlbumName() + " already exist");
            return;
        }
        this.albumList.add(album);
        System.out.println("MusicPlayList.Album " + album.getAlbumName() + " added successfully");

        for (int i = 0; i < this.albumList.size(); i++) {
            System.out.println("Do you want to add MusicPlayList.Song to this album ?");
            String response = scanSong.nextLine();
            if (response.equals("YES") || response.equals("Yes") || response.equals("yes")) {
                System.out.println("Enter song tittle: \r");
                String songTittle = scanSong.nextLine();
                int findSongName = this.albumList.get(i).findSongIndex(songTittle);
                if (findSongName >= 0) {
                    System.out.println("MusicPlayList.Song already existed and cannot be added to album " + album.getAlbumName());
                    return;
                }
                System.out.println("Enter song duration: \r");
                String songDuration = scanSong.nextLine();
                album.addSongToAlbum(Song.createNewSong(songTittle, songDuration));
            }

        }
    }

    public void deleteAlbum(String albumName) {
        int findAlbumName = findAlbum(albumName);
        if (findAlbumName < 0) {
            System.out.println("MusicPlayList.Album tittled " + albumName + " not found");
            return;
        }
        this.albumList.remove(findAlbumName);
        System.out.println("MusicPlayList.Album tittled " + albumName + " deleted successfully");

    }

    public void addSongToAlbum(String newSong) {
        Scanner scanNewSong = new Scanner(System.in);
        for (int i = 0; i < this.albumList.size(); i++) {
            int findSong = this.albumList.get(i).findSongIndex(newSong);
            if (findSong >= 0) {
                System.out.println("MusicPlayList.Song already exist on the MusicPlayList.Album list");
                return;
            }

        }
        System.out.println("Enter MusicPlayList.Song Duration: ");
        String songDuration = scanNewSong.nextLine();
        Song createNewSong = Song.createNewSong(newSong, songDuration);
        System.out.println("Enter MusicPlayList.Album name: ");
        String albumName = scanNewSong.nextLine();
        int findAlbum = findAlbum(albumName);
        if (findAlbum >= 0) {
            for (int i = 0; i < this.albumList.size(); i++) {
                this.albumList.get(findAlbum).addSongToAlbum(createNewSong);
            }
        }
    }

    public void addSongToPlayList(String songName) {
        for (int i = 0; i < this.albumList.size(); i++) {
            Song findSong = this.albumList.get(i).findSong(songName);
            int findSongInPlayList = findSongInPlayList(songName);
            if (findSong != null && findSongInPlayList < 0) {
                songLinkedList.add(findSong);
                System.out.println("MusicPlayList.Song tittled " + songName + " added to MusicPlayList.PlayList");
                return;
            }

        }
        System.out.println("MusicPlayList.Song tittled " + songName + " already exist on your MusicPlayList.PlayList.");
    }

    public void playSong(LinkedList<Song> linkedList) {
        Scanner scanSong = new Scanner(System.in);
        ListIterator<Song> songListIterator = linkedList.listIterator();
        boolean quit = false;
        skipForward2(songListIterator);
        while (!quit) {
            System.out.println("Enter 1: Next | 2: Backward | 3:Replay | 0: Quit: ");
            int press = scanSong.nextInt();
            switch (press) {
                case 1:
                    skipForward2(songListIterator);
                    break;
                case 2:
                    skipBackward2(songListIterator);
                    break;
                case 3:
                    replaySong();
                    break;
                case 0:
                    System.out.println("Device shutting down...");
                    quit = true;
                    break;
            }
        }
    }

    private void skipForward(ListIterator<Song> listIterator) {
        Scanner scanLinkedList = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter function to skip forward: ");
            int press = scanLinkedList.nextInt();
            switch (press) {
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing next MusicPlayList.Song " + listIterator.next().getTittle() + "\n MusicPlayList.Song Duration: " +
                                listIterator.previous().getDuration());
                        listIterator.next();
                    } else {
                        System.out.println("Reach the end of the list");
                        // do you want to quit/
                        quit = true;
                        //TODO 1: Enter 2 to backward
                        //TODO 2: check if input is 2 and call skipBackward
                        //TODO 2: check if input is not 2 and quit;
                    }
                    break;
                case 0:
                    System.out.println("Wrong option press, please press 1");
                    quit = false;
                    break;
                default:
                    System.out.println("Quiting operation...");
                    quit = true;
                    break;
            }

        }
    }

    private void skipBackward(ListIterator<Song> listIterator) {
        Scanner scanLinkedList = new Scanner(System.in);
        boolean quit = false;
        int count = 0;
        while (!quit) {
            count++;
            System.out.println("Enter function to skip backward: ");
            int press = scanLinkedList.nextInt();
            switch (press) {
                case 2:
                    if (count == 1 && listIterator.hasPrevious()) {
                        listIterator.previous();
                        System.out.println("Now playing previous MusicPlayList.Song " + listIterator.previous().getTittle() + "\n MusicPlayList.Song Duration: " +
                                listIterator.next().getDuration());
                        listIterator.previous();
                    } else if (count != 1 && listIterator.hasPrevious()) {
                        System.out.println("Now playing previous MusicPlayList.Song " + listIterator.previous().getTittle() + "\n MusicPlayList.Song Duration: " +
                                listIterator.next().getDuration());
                        listIterator.previous();

                    } else {
                        System.out.println("Reach the start of the list");
                        quit = true;

                        //TODO 1: Enter 1 to forward
                        //TODO 2: check if input is 1 and call skipForward
                        //TODO 2: check if input is not 1 and quit;
                    }
                    break;
                case 0:
                    System.out.println("Wrong option press, please press 2");
                    quit = false;
                    break;
                default:
                    System.out.println("Quiting operation...");
                    quit = true;
                    break;
            }

        }
    }

    private void replaySong(ListIterator<Song> listIterator) {
        boolean goingForward = true;
        while (listIterator.hasNext() && goingForward) {
            if (listIterator.hasPrevious()) {
                System.out.println("replaying " + listIterator.previous().getTittle() + "\n MusicPlayList.Song Duration: " +
                        listIterator.next().getDuration());
                goingForward = false;
            } else {
                System.out.println("replaying " + listIterator.next().getTittle() + "\n MusicPlayList.Song Duration: " +
                        listIterator.previous().getDuration());
                goingForward = false;
            }

        }

    }

    public int findSongInPlayList(String songName) {
        Song song;
        for (int i = 0; i < songLinkedList.size(); i++) {
            song = this.songLinkedList.get(i);
            if (song.getTittle().equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    public void removeSongFromPlayList(String songName) {
        int findSongName = findSongInPlayList(songName);
        if (findSongName >= 0) {
            this.songLinkedList.remove(findSongName);
            System.out.println("MusicPlayList.Song tittled " + songName + " removed from MusicPlayList.PlayList");
            return;
        }
        System.out.println("MusicPlayList.Song tittled " + songName + " is not on your MusicPlayList.PlayList");
    }

    public void printAlbumSong() {
        for (int i = 0; i < albumList.size(); i++) {
            albumList.get(i).printAlbumSong();
        }
    }

    public void printPlayList() {
        for (int i = 0; i < songLinkedList.size(); i++) {
            System.out.println(i + 1 + ". " + songLinkedList.get(i).getTittle() + "\n " +
                    "Duration: " + songLinkedList.get(i).getDuration());
        }
    }
}
