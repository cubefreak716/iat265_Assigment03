import processing.core.PApplet;

public class Gear extends PApplet{

	PApplet p;
	float xPos, yPos;
	float radius; 
	
	Gear(PApplet parent, float x, float y){
		p = parent;
		xPos = x;
		yPos = y;
	
	}
	
	
	void drawMe() {
		p.pushMatrix();
		p.translate(xPos, yPos);
		p.ellipse(0, 0, 100, 100);
		p.popMatrix();
	}
	
	
}
