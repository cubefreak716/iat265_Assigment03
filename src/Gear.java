import processing.core.PApplet;

public class Gear extends PApplet{

	PApplet p;
	float xPos, yPos;
	float radius; 
	
	Gear(PApplet parent, float x, float y, float r){
		p = parent;
		xPos = x;
		yPos = y;
		radius = r;
	}
	
	
	void drawMe() {
		p.pushMatrix();
		p.translate(xPos, yPos);
		p.ellipse(0, 0, 2*radius, 2*radius);
		p.popMatrix();
	}
	
	
}
