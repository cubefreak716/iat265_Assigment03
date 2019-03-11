import processing.core.PApplet;
public class Wheel {

	PApplet p;
	float posX, posY;
	float r;
	float angle;
	
	Wheel(PApplet parent, float x, float y, float radius){
		p = parent;
		posX = x;
		posY = y;
		r = radius;
		angle = 0; 
	}
	
	
	void drawMe() {
		p.pushMatrix();
		p.translate(posX, posY);
		p.rotate(angle);
		p.ellipse(0,0,r,r);
		p.ellipse(0,0,r/2,r/2);
		p.line(0,0, 0, r/2);	
		angle += 0.05;
		p.popMatrix();
		
	}
	
	
	
}
