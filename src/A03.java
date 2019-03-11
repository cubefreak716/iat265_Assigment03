import processing.core.*;
import controlP5.*;


public class a03 extends PApplet{
	
	Gear g1;
	Gear g2;
	Gear g3; 
	float angle;
	float x1,x2,x3,x4;
	float y1,y2,y3,y4;
	UIHelper u; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("a03");
	}

    public void settings(){
    	size(800,800);
    }

    public void setup(){
    	g1 = new Gear(this, width/4, height/2);
    	g2 = new Gear(this, 3*width/4, height/2-200);
    	g3 = new Gear(this, 300, 200);
    }

    public void draw(){
    	background(255);
    	pushStyle();
    	stroke(2);
    	rect(0,0,width/8, height);
    	popStyle();
    	g1.drawMe();
    	g2.drawMe();
    	g3.drawMe();
    	drawBelt(g1,g2);
    	drawBelt(g1, g3);
    }
    
    public void drawBelt(Gear G1, Gear G2) {
    	angle = atan((G1.yPos-G2.yPos)/(G1.xPos-G2.xPos));
    	x1 = G1.xPos+50*sin(angle);
    	x2 = G1.xPos-50*sin(angle);
    	y1 = G1.yPos-50*cos(angle);
    	y2 = G1.yPos+50*cos(angle);
    	
    	x3 = G2.xPos+50*sin(angle);
    	x4 = G2.xPos-50*sin(angle);
    	y3 = G2.yPos-50*cos(angle);
    	y4 = G2.yPos+50*cos(angle);
    	
    	line(x1,y1,x3,y3);
    	line(x2,y2,x4,y4);
    }
    
    public void mousePressed() {
    	println("hi");
    }
    
}
