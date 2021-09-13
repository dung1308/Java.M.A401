/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.main;

import fa.training.management.MultimediaManagement;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultimediaManagement multi = new MultimediaManagement();
        int choice=0;
        do{
            System.out.println("1. Add a new video");
            System.out.println("2. Add a new song");
            System.out.println("3. Show all multimedia");
            System.out.println("4. Exit");
            boolean checkId = false;
            do{
                try{
                    System.out.println("Choice:");
                    choice = Integer.parseInt(sc.nextLine());
                    checkId = true;
                }catch(NumberFormatException e){
                    System.out.println("Errror");
                }
            }while(checkId == false);
            switch(choice){
                case 1:
                    multi.addVideo();
                    break;
                case 2:
                    multi.addSong();
                    break;
                case 3:
                    multi.display();
                    break;
                case 4:
                    choice =4;
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
        }while(choice!=4);
    }
}
