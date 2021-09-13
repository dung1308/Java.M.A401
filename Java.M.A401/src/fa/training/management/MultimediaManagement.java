/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.management;

import fa.training.entities.Multimedia;
import fa.training.entities.Song;
import fa.training.entities.Video;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MultimediaManagement {
    private ArrayList<Multimedia> listOfMultimedia;

    public ArrayList<Multimedia> getListOfMultimedia() {
        return listOfMultimedia;
    }

    public void setListOfMultimedia(ArrayList<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
    }

    public MultimediaManagement(){
        this.listOfMultimedia = new ArrayList<Multimedia>();
    }
    
    public MultimediaManagement(ArrayList<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
    }

    public void display(){
        if(this.listOfMultimedia.size() < 1){
            return;
        }
        System.out.println("------LIST OF MULTIMEDIA------");
        for(Multimedia x:this.listOfMultimedia){
            System.out.println(x);
        }
    }
    public void addSong(){
        Multimedia song = new Song();
        ((Song) song).createSong();
        listOfMultimedia.add(song);
    }
    public void addVideo(){
        Multimedia video = new Video();
        ((Video) video).createVideo();
        listOfMultimedia.add(video);
    }
}
