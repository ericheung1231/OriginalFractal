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

public class OriginalFractal extends PApplet {

int siz;
public void setup() 
{   
	size(1000,1000);    
} 
public void draw() 
{
	background(0);
	stroke(255);
	noFill();
	ellipse(500,500,700,700);
	siz = (int)mouseX/100;
	drawFrac(500,500,700);
	
}

public void drawFrac(float x,float y, float r) 
{   
	ellipse(x,y-r/4,r/2,r/2);
	ellipse(x,y+r/4,r/2,r/2);
	ellipse(x-r/4,y,r/2,r/2);
	ellipse(x+r/4,y,r/2,r/2);
	if(r >= 100)
	{
		drawFrac(x,y,r/2);
		drawFrac(x-r/4,y,r/2);
		drawFrac(x+r/4,y,r/2);
		drawFrac(x,y+r/4,r/2);
		drawFrac(x,y-r/4,r/2);
	}
	
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
