import processing.core.*;
import controlP5.*;


public class A03 extends PApplet{
	
	Gear g1;
	Gear g2;
	Gear g3; 
	Gear g4;
	float angle;
	float x1,x2,x3,x4;
	float y1,y2,y3,y4;
	ControlP5 cp5;
	float xP, yP;
	Slider rSlider;
	Button addGear;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("A03");
	}

    public void settings(){
    	size(800,800);
    }

    public void setup(){
    	cp5 = new ControlP5(this);
    	g1 = new Gear(this, width/2, height/2,50);
    	g2 = new Gear(this, 300+width/2, height/2-200,30);
    	g3 = new Gear(this, 300, 200,100);
    	g4 = new Gear(this, mouseX, 600, 30);
    	initUI();
    }

    public void draw(){
    	background(255);
    	pushStyle();
    	stroke(2);
    	rect(0,0,200, height);
    	popStyle();
    	g1.drawMe();
//    	g2.drawMe();
    	g3.drawMe();
//    	g4.drawMe();
//    	g4.xPos = mouseX;
//    	g4.yPos = mouseY;
//    	drawBelt(g1,g2);
    	drawBelt(g1, g3);
//    	drawBelt(g4,g1);
    	
    }
    
    public void drawBelt(Gear G1, Gear G2) {
    	
    	//both radius is the same
    	if(G1.radius==G2.radius) {    	
	    	angle = atan((G1.yPos-G2.yPos)/(G1.xPos-G2.xPos));
	    	x1 = G1.xPos+G1.radius*sin(angle);
	    	x2 = G1.xPos-G1.radius*sin(angle);
	    	y1 = G1.yPos-G1.radius*cos(angle);
	    	y2 = G1.yPos+G1.radius*cos(angle);
	    	
	    	x3 = G2.xPos+G2.radius*sin(angle);
	    	x4 = G2.xPos-G2.radius*sin(angle);
	    	y3 = G2.yPos-G2.radius*cos(angle);
	    	y4 = G2.yPos+G2.radius*cos(angle);
	    	
	    	line(x1,y1,x3,y3);
	    	line(x2,y2,x4,y4);
    	}
    	else{ //g1 is ro and g2 is r1
    		
    		if(G1.radius<G2.radius) { //swap if g2>g1
    			Gear temp = G2;
    			G2 = G1;
    			G1 = temp;
    		}
    		//find intersection point
    		xP = (G2.xPos*G1.radius - G1.xPos*G2.radius)/(G1.radius-G2.radius);
    		yP = (G2.yPos*G1.radius - G1.yPos*G2.radius)/(G1.radius-G2.radius);
    		
    		float xF1 = ((pow(G1.radius,2) * (xP-G1.xPos) + (G1.radius*(yP-G1.yPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.xPos;
        	float xF2 = ((pow(G1.radius,2) * (xP-G1.xPos) - (G1.radius*(yP-G1.yPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.xPos;
        	float yF1 = ((pow(G1.radius,2) * (yP-G1.yPos) - (G1.radius*(xP-G1.xPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.yPos;
        	float yF2 = ((pow(G1.radius,2) * (yP-G1.yPos) + (G1.radius*(xP-G1.xPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.yPos;
        	
//        	float check = ((G1.yPos-yF1)*(yP-yF1))/((xF1-G1.xPos)-(xF1-xP));
//        	float check1= ((G1.yPos-yF2)*(yP-yF2))/((xF2-G1.xPos)-(xF2-xP));
        	//println(check1);
        	
        	float xF3 = ((pow(G2.radius,2) * (xP-G2.xPos) + (G2.radius*(yP-G2.yPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.xPos;
        	float xF4 = ((pow(G2.radius,2) * (xP-G2.xPos) - (G2.radius*(yP-G2.yPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.xPos;
        	float yF3 = ((pow(G2.radius,2) * (yP-G2.yPos) - (G2.radius*(xP-G2.xPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.yPos;
        	float yF4 = ((pow(G2.radius,2) * (yP-G2.yPos) + (G2.radius*(xP-G2.xPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.yPos;
        	        	
        	pushStyle();
        	strokeWeight(3);
        	point(xP,yP);
        	line(xF1,yF1,xF3,yF3);
        	line(xF2,yF2,xF4,yF4);        	
        	popStyle();
    	}
    }
    
    void styleCaptionLabel(Label l) {
    	  PFont font = createFont("arial", 16);
    	  l.setLineHeight(20).setFont(font)
    	    .setColor(0)
    	    .align(ControlP5.LEFT_OUTSIDE, CENTER);
    	  ;
	}
    
    Slider createSlider(String key, String label, float x, float y, float min, float max) {
    	  Slider s = cp5.addSlider(key).setPosition(x, y)
    	    .setRange(min, max)
    	    .setLabel(label)
    	    .setSize(100, 20);
    	  styleCaptionLabel(s.getCaptionLabel());
    	  return s;
    }
    
    Button createButton(String key, String label, float x, float y){
    	  Button b = cp5.addButton(key)
    	  .setLabel(label)
    	  .setSize(75, 50)
    	  .setPosition(x, y);
//    	  styleButton(b);
    	  return b;
    }
    
    void initUI() {
    	 rSlider = createSlider("radius", "Radius", 80, 50, 0, 255);
    	 addGear = createButton("add","Add", 20,100);
    }
        
    public void mousePressed() {
    	println("hi");
    }
    
}
