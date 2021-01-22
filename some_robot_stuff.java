import java.awt.*;
import java.awt.event.InputEvent;

public class Pffffff{
  
  private Robot robot;
  public Pffffff(){
  try{
    robot = new Robot();
  }catch(Exception e){
    e.printStackTrace;
  }
    private void start(){
      
      while(true){
        int x = MouseInfo.getPointerInfo().getLocation.x
        int y = MouseInfo.getPointerInfo().getLocation.y
          Color hello = robot.getPixelColor(x, y);
        System.out.print("X: " +x + " Y: " + y + "Color: " + hello+ "\r");
      }
    }
    public stativ void main (String[] args){
      new Pffffff().start();
    }
}

