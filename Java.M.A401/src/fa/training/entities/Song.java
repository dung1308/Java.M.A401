/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.entities;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Song extends Multimedia{
    private String singer;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Song() {
    }

    public Song(String name, double duration, String singer) {
        super(name, duration);
        this.singer = singer;
    }
    
    public void createSong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Enter song information------");
        super.createMultimedia();
        System.out.println("Enter singer:");
        String singer = sc.next();
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{"+"name:"+super.getName()+", duration"+super.getDuration()+", singer:"+this.singer + '}';
    }
    
}
