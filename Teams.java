package com.company;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.PixelGrabber;

public class Teams {
    private  Robot robot;
    public Teams(){
        try{
            robot = new Robot();        //creates Robot and stuff
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     public  void start() {
        int a = 1;

         while (a == 1) {
             robot.mouseMove(1710, 1009);

             Color color = new Color(98, 100, 167);
             Color colo = robot.getPixelColor(1735, 930);       //I could remove everything from the colors except color and colo, but im too lazy so sorry
             Color Mute = robot.getPixelColor(1075, 459);
             Color purple = new Color(139, 140, 199);
             Color purplefailsafe = new Color(166, 167, 220);
             Color dark = new Color(32, 31, 31);

             if (colo.equals(color)) {
                 robot.mouseMove(1710, 1009);
                 robot.delay(10);
                 robot.mousePress(InputEvent.BUTTON1_MASK);
                 robot.delay(10);
                 robot.mouseRelease(InputEvent.BUTTON1_MASK);      //if this is true we move on to the interface that shows up when you will join a meeting
                 a = 2;
             }}

             while( a == 2) {


                 Color color = new Color(98, 100, 167);
                 Color colo = robot.getPixelColor(1735, 930);
                 Color Mute = robot.getPixelColor(1076, 462);       //It just looks at the pixel and decides than what to do. The Pixels x and y coordinate are persolized for my VM-sceen (I use VirtualBox)
                 Color purple = new Color(139, 140, 199);           //, you may have to change the  x and y coordinates but i think the color is the same.
                 Color purplefailsafe = new Color(166, 167, 220);
                 Color dark = new Color(32, 31, 31);
                 try{
                     Thread.sleep(10000);                           //It sleeps so there are not so many unwanted results 
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }


              if (Mute.equals(purple)) {
                  robot.mouseMove(1075, 459);
                  robot.delay(1);
                  robot.mousePress(InputEvent.BUTTON1_MASK);
                  robot.delay(1);
                  robot.mouseRelease(InputEvent.BUTTON1_MASK);
                  try{
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  robot.delay(10);
                  robot.mouseMove(1368, 686);


                 } if (Mute.equals(purplefailsafe)) {
                     robot.mouseMove(1075, 459);
                     robot.delay(1);
                     robot.mousePress(InputEvent.BUTTON1_MASK);
                     robot.delay(1);
                     robot.mouseRelease(InputEvent.BUTTON1_MASK);
                     try{
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     robot.delay(10);
                     robot.mouseMove(1368, 686);

                 }
              else if(Mute.equals(dark)){
                     robot.mouseMove(1368, 686);
                     robot.delay(10);
                     robot.mousePress(InputEvent.BUTTON1_MASK);
                     robot.delay(10);
                     robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    a = 3;                                              //Now we joined the meeting with the mic muted now it checks IF the mic is muted

                 }

             }
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            while (a == 3){
                try{
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Color muterule = robot.getPixelColor(1680, 70);
                Color unmuted = new Color(255, 255, 255);
                Color Mutes = robot.getPixelColor(1760, 1000);
                Color unmutes = new Color(131, 130, 130);
                Color Mutefailsafe = robot.getPixelColor(1746, 993);        //again these are my x and y coordinates you may have to change them
                if(muterule.equals(unmuted)){
                    robot.delay(3542);                                      //If we are unmuted, it automatically mutes us in a couple of seconds
                    robot.mouseMove(1680, 70);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.delay(1);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.mouseMove(0, 0);
                }
                if(Mutes.equals(unmutes)){
                    robot.delay(2200);
                    robot.mouseMove(1760, 1000);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.delay(1);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.mouseMove(0, 0);
                }
                if(Mutes.equals(unmuted)){
                    robot.delay(2200);
                    robot.mouseMove(1760, 1000);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.delay(1);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.mouseMove(0, 0);
                }
                if(Mutefailsafe.equals(unmutes)){
                    robot.delay(2200);
                    robot.mouseMove(1760, 1000);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.delay(1);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.mouseMove(0, 0);
                }
                if(Mutefailsafe.equals(unmuted)){
                    robot.delay(2200);
                    robot.mouseMove(1760, 1000);
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.delay(1);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    robot.mouseMove(0, 0);
                }

            }

     }


    public static void main(String[] args) {
        Teams teams = new Teams();
        teams.start();              //it execudes the code above
    }
}
