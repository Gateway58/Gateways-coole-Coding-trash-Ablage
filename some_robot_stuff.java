import java.awt.*;
import java.awt.event.InputEvent; //implement the needed things

public class Pffffff{
  
  private Robot robot; //decalre robot
  public Pffffff(){
  try{
    robot = new Robot(); //tell what robot is , you have to sorround it with try catch because otherwise java has a problem
  }catch(Exception e){
    e.printStackTrace;
  }
    private void start(){
      
      while(true){      // make sure the Location and color is live 
        int x = MouseInfo.getPointerInfo().getLocation.x  //get the x Location of your Coursor with the help of  java.awt.event.InputEvent
        int y = MouseInfo.getPointerInfo().getLocation.y  //get the y Location of your Coursor with the help of  java.awt.event.InputEvent
          Color hello = robot.getPixelColor(x, y);        // get the color with the help of java.awt.robot
        System.out.print("X: " +x + " Y: " + y + "Color: " + hello+ "\r"); //print that out
      }
    }
    public stativ void main (String[] args){
      new Pffffff().start();    //execute start().
    }
}
  // Thank you that you allowed me to waste your time ;)

