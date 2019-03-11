import processing.core.*;
public class A03 extends PApplet{

	Wheel[] wheels = new Wheel[2];
	
	Wheel w1, w2;
	Belt b1, b2;
	
	Wheel w3,w4;
	Belt b3,b4;
	
	Wheel w5,w6;
	Belt b5,b6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Lab08");
	}

	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		
//		for(int i = 0; i<wheels.length; i++) {
//			wheels[i] = new Wheel(this, random(10+200,width-200),height/2,100);
//		}
		
//		w1 = new Wheel(this, 200, 100 , 100);
//		w2 = new Wheel(this, 500, 100, 100);
//		b1 = new Belt(this,w1.posX, w1.posY-w1.r/2, w2.posX, w2.posY-w2.r/2);
//		b2 = new Belt(this,w1.posX, w1.posY+w1.r/2, w2.posX, w2.posY+w2.r/2);
		
		w3 = new Wheel(this,200,300,100);
		w4 = new Wheel(this,500,300,100);
		b3 = new Belt(this,w3.posX, w3.posY-w3.r/2, w4.posX, w4.posY-w4.r/2);
		b4 = new Belt(this,w3.posX, w3.posY+w3.r/2, w4.posX, w4.posY+w4.r/2);
		
		w5 = new Wheel(this,200,525,170);
		w6 = new Wheel(this,500,500,70);
		b5 = new Belt(this,w5.posX, w5.posY-w5.r/2, w6.posX, w6.posY-w6.r/2);
		b6 = new Belt(this,w5.posX, w5.posY+w5.r/2, w6.posX, w6.posY+w6.r/2);
	}
	
	public void draw() {
		background(255);
		
//		for(int i = 0; i<wheels.length; i++) {
//			wheels[i].drawMe();
//		}
//		
//		w1.drawMe();
//		w2.drawMe();
//		b1.drawMe();
//		b2.drawMe();
		
		w3.drawMe();
		w4.drawMe();
		
		drawBelt(w3,w4);
		
		b3.drawMe();
		b4.drawMe();
		
		w5.drawMe();
		w6.drawMe();
		b5.drawMe();
		b6.drawMe();
		
	}
	
	public void drawBelt(Wheel W1, Wheel W2) {
		
		float theta = atan(W2.posY - W1.posY)/(W2.posX-W1.posX);
		
//		println(theta);
//		pushStyle();
//		strokeWeight(10);
//		point(W1.posX + W1.r*sin(theta), W1.posY +W1.r*cos(theta));
//		popStyle();
		
		
	
	}
	
}
