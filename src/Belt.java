import processing.core.PApplet;

public class Belt extends PApplet{

	PApplet p;
	float angle;
	float x1,x2,x3,x4;
	float y1,y2,y3,y4;
	float xP, yP;
	Gear G1, G2;
	
	Belt(PApplet parent, float X1, float X2, float X3, float X4, float Y1, float Y2, float Y3, float Y4){
		p = parent; 
		x1 = X1; 
		x2 = X2;
		x3 = X3; 
		x4 = X4; 
		y1 = Y1; 
		y2 = Y2; 
		y3 = Y3;
		y4 = Y4; 
	}
	
	public void drawMe() {
		p.line(x1,y1,x3,y3);
    	p.line(x2,y2,x4,y4); 
	}
	
//	Belt(PApplet parent, Gear g1, Gear g2){
//	p = parent; 
//	G1 = g1; 
//	G2 = g2; 
//	
//}
		
//    public void drawBelt() {
//    	
//    	//both radius is the same
//    	if(G1.radius==G2.radius) {    	
//	    	angle = atan((G1.yPos-G2.yPos)/(G1.xPos-G2.xPos));
//	    	x1 = G1.xPos+G1.radius*sin(angle);
//	    	x2 = G1.xPos-G1.radius*sin(angle);
//	    	y1 = G1.yPos-G1.radius*cos(angle);
//	    	y2 = G1.yPos+G1.radius*cos(angle);
//	    	
//	    	x3 = G2.xPos+G2.radius*sin(angle);
//	    	x4 = G2.xPos-G2.radius*sin(angle);
//	    	y3 = G2.yPos-G2.radius*cos(angle);
//	    	y4 = G2.yPos+G2.radius*cos(angle);
//	    	
//	    	line(x1,y1,x3,y3);
//	    	line(x2,y2,x4,y4);
//    	}
//    	else{ //g1 is ro and g2 is r1
//    		
//    		if(G1.radius<G2.radius) { //swap if g2>g1
//    			Gear temp = G2;
//    			G2 = G1;
//    			G1 = temp;
//    		}
//    		//find intersection point
//    		xP = (G2.xPos*G1.radius - G1.xPos*G2.radius)/(G1.radius-G2.radius);
//    		yP = (G2.yPos*G1.radius - G1.yPos*G2.radius)/(G1.radius-G2.radius);
//    		
//    		float xF1 = ((pow(G1.radius,2) * (xP-G1.xPos) + (G1.radius*(yP-G1.yPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.xPos;
//        	float xF2 = ((pow(G1.radius,2) * (xP-G1.xPos) - (G1.radius*(yP-G1.yPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.xPos;
//        	float yF1 = ((pow(G1.radius,2) * (yP-G1.yPos) - (G1.radius*(xP-G1.xPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.yPos;
//        	float yF2 = ((pow(G1.radius,2) * (yP-G1.yPos) + (G1.radius*(xP-G1.xPos)) * sqrt(pow((xP-G1.xPos),2) + pow((yP-G1.yPos),2)-pow(G1.radius,2)))/(pow(xP-G1.xPos,2) + pow(yP-G1.yPos,2))) + G1.yPos;
//        	
//        	float xF3 = ((pow(G2.radius,2) * (xP-G2.xPos) + (G2.radius*(yP-G2.yPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.xPos;
//        	float xF4 = ((pow(G2.radius,2) * (xP-G2.xPos) - (G2.radius*(yP-G2.yPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.xPos;
//        	float yF3 = ((pow(G2.radius,2) * (yP-G2.yPos) - (G2.radius*(xP-G2.xPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.yPos;
//        	float yF4 = ((pow(G2.radius,2) * (yP-G2.yPos) + (G2.radius*(xP-G2.xPos)) * sqrt(pow((xP-G2.xPos),2) + pow((yP-G2.yPos),2)-pow(G2.radius,2)))/(pow(xP-G2.xPos,2) + pow(yP-G2.yPos,2))) + G2.yPos;
//        	        	
//        	pushStyle();
//        	strokeWeight(1);
//        	point(xP,yP);
//        	line(xF1,yF1,xF3,yF3);
//        	line(xF2,yF2,xF4,yF4);        	
//        	popStyle();
//    	}
//    }//end of draw belt
	
	
}
