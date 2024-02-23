import processing.core.PApplet;
import processing.core.PApplet;

public class Sketch extends PApplet {
 /*
  * A program that uses java processing to create a remote control
  * @author: Austin L
  */

  // Sets the size of the window
  public void settings() {
    size(600, 600);
  }

  /**
   * Sets background to light green
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

	  // Creates rectangle (remote control antenna)
    stroke(255);
    rect(295, 225, 30, 200);

    // Creates rectangle (remote control)
    stroke(255);
    square(200, 350, 220);
    fill(0, 0, 0);

    // Creates circle (remote control button)
    stroke(255);
    fill(255, 0, 0);
    ellipse(310, 460, 150, 150);

  }
}