import processing.core.PApplet;
public class Belt {

	float startX, startY;
	float endX, endY;
	
	float X1,X2, X3,X4;
	float Y1, Y2, Y3, Y4;
	
	PApplet p;
	float angle;
	float radius;
	float x, y;
	
	float d;
	
	
	Belt (PApplet parent, float x1,float y1, float x2, float y2){
		p = parent;
		startX = x1;
		startY = y1;
		endX = x2;
		endY = y2;
		 
		x = x2-x1;
		y = y2-y1;
		d = p.sqrt(p.pow(x,2)+p.pow(y,2));
		p.println(d);
		angle = p.atan(y/x);
		//p.println(angle);
//		startX = x1 + (r1*p.sin(angle));
//		startY = y1 +(r1*p.cos(angle));
//		endX = x2 +(r2*p.sin(angle));
//		endY = x2 +(r2*p.cos(angle));
//		X1 = x1 + (r1*p.sin(angle));
//		X2 = x1 - (r1*p.sin(angle));
//		Y1 = y1 + (r1*p.cos(angle));
//		Y2 = y1 - (r1*p.cos(angle));
		
	}
	
	void drawMe() {
		//angle 
		
		p.line(startX, startY, endX, endY);
	}
	
	
	
	
}
