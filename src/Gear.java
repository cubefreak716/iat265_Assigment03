import processing.core.PApplet;

public class Gear extends PApplet{

	PApplet p;
	float xPos, yPos;
	float radius; 
	Gear left, right;
	
	Gear(PApplet parent, float x, float y, float r){
		p = parent;
		xPos = x;
		yPos = y;
		radius = r;
		left = null;
		right = null;
	}
	
	
	void drawMe() {
		p.pushMatrix();
		p.translate(xPos, yPos);		
		p.ellipse(0, 0, 2*radius, 2*radius);
		p.line(0, 0, radius, 0);
		p.line(0, 0, 0, radius);
		p.line(0, 0, -radius, 0);
		p.line(0, 0, 0, -radius);
		p.ellipse(0,0,radius,radius);
		p.popMatrix();
	}
	
	
}
