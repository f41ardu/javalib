import HelloLibrary.*;
import processing.core.PApplet;

public class HelloTest extends PApplet {

	public static void main(String... args) {
       	 HelloTest sketch = new HelloTest();
        sketch.runSketch();
    }

 public void settings() {
        size(640, 480);
    }



HelloLibrary hello;

  public void setup() {
  
    hello = new HelloLibrary(this);
  
    //PFont font = createFont("",40);
    //textFont(font);
    noLoop();
  }

  public void draw() {
    background(0);
    fill(255);
    text(hello.sayHello(), 40, 200);
    println(hello.sayHello());
  }
}
