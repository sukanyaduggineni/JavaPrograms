package com.meryemalay;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
	    Album album = new Album("Stormbringer", "Deep Purple");
	    album.addSong("Stormbringer Song 1", 4.21);
        album.addSong("Stormbringer Song 2", 3.15);
        album.addSong("Stormbringer Song 3", 4.33);
        album.addSong("Stormbringer Song 4", 4.25);
        album.addSong("Stormbringer Song 5", 3.35);
        album.addSong("Stormbringer Song 6", 4.09);
        album.addSong("Stormbringer Song 7", 3.95);
        album.addSong("Stormbringer Song 8", 2.55);
        albums.add(album);

        album = new Album("Nothing", "AC/DC");
        album.addSong("Nothing Song 1", 4.2);
        album.addSong("Nothing Song 2", 3.15);
        album.addSong("Nothing Song 3", 4.33);
        album.addSong("Nothing Song 4", 4.25);
        album.addSong("Nothing Song 5", 3.35);
        album.addSong("Nothing Song 6", 4.09);
        album.addSong("Nothing Song 7", 3.95);
        album.addSong("Nothing Song 8", 2.55);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Stormbringer Song 1", playList);
        albums.get(0).addToPlayList("Stormbringer Song 5", playList);
        albums.get(0).addToPlayList("Stormbringer Song 11", playList); // Does not exist
        albums.get(0).addToPlayList(7, playList);

        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(22, playList); // There is no track 24

        play(playList);
    }

    private static void play (LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " +listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    //printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }

    }

    public static void printMenu(){
        System.out.println("0 - quit\n" +
                        "1 - to skip next song\n" +
                        "2 - to skip previous song\n" +
                        "3 - to replay song\n" +
                        "4 - to list all songs in the play list\n" +
                        "5 - to remove the current song\n" +
                        "6 - to print menu");
    }
}
