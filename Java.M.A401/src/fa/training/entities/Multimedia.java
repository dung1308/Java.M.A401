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
public abstract class Multimedia {
    private String name;
    private double duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Multimedia(){
        
    }
    
    public Multimedia(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }
    
    public void createMultimedia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        this.name = name;
        System.out.println("Enter duration:");
        double duration = sc.nextDouble();
        this.duration = duration;
    }
}
