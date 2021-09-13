/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.entities;

/**
 *
 * @author ASUS
 */
public class Video extends Multimedia{

    public Video() {
    }

    public Video(String name, double duration) {
        super(name, duration);
    }

    public void createVideo(){
        System.out.println("------Enter video information------");
        super.createMultimedia();
    }

    @Override
    public String toString() {
        return "Video{"+" name:"+super.getName()+", duration:"+super.getDuration() + '}';
    }
    
    
    
}
