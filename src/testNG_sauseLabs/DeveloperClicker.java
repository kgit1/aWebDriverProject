//package testNG_sauseLabs;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.InputEvent;
//
//public class DeveloperClicker {
//  public static void main(String[] args) {
//    // As long as you don't move the Chrome window, the Cancel button should appear here.
//    int x = 410;
//    int y = 187;
//
//    try {
//      Thread.sleep(7000);// can also use robot.setAutoDelay(500);
//      Robot robot = new Robot();
//      robot.mouseMove(x, y);
//      robot.mousePress(InputEvent.BUTTON1_MASK);
//      robot.mouseRelease(InputEvent.BUTTON1_MASK);
//      Thread.sleep(3000);// can also use robot.setAutoDelay(500);
//    } catch (AWTException e) {
//      System.err.println("Error clicking Cancel.");
//      e.printStackTrace();
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//  }
//}