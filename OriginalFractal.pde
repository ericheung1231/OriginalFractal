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
