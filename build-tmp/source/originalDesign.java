import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class originalDesign extends PApplet {

public void setup()
{
size(400,400);
}


public void draw()
{
  face();
}
public void mousePressed() {
   background(random(224,250),random(220,255),random(220,255));
}

public void face ()
{
	if(mouseX>200){
        ellipse(mouseX,mouseY,random(5,50),random(5,30));
        fill(random(0,255), random(100,255), random(100,255));
    }
    if(mouseX<=200){
        rect(mouseX,mouseY,random(5,40),random(5,40),2);
        fill(random(0,100), random(0,100), random(0,100));
    }
	/*fill(random(0,255),random(0,255),random(0,255));
  ellipse(mouseX,mouseY,random(10,50),random(10,50));
*/}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "originalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
