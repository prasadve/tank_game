package Game;
import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.image.BufferedImage;

public class RedBall {
	
	Image ball;// these variables store the images of the background and the ball
	static int xCoordinate, yCoordinate;// stores the current x and y coordinates
	int dx,dy;// stores the velocity of the ball
	
	public RedBall(){
	xCoordinate=RedTank.getX();
	yCoordinate=RedTank.getY();
	Toolkit kit = Toolkit.getDefaultToolkit();
	ball=kit.getImage("ball.png");
	}
	public void launch(){
		xCoordinate=xCoordinate+dx;
		yCoordinate=yCoordinate+dy;
	}
	public void load(){
		xCoordinate=RedTank.getX();
		yCoordinate=RedTank.getY();
		dx=RedTank.getdx();
		dy=RedTank.getdy();
	}
	
	public void draw(Graphics2D g){
    	g.drawImage(ball, xCoordinate, yCoordinate,null);
    	if(xCoordinate<0){// if touching left screen then velocity changes to 1 so that it moves right
			dx=10;
		}
		else if (xCoordinate>=1000-45){// if touching right screen then velocity changes to -1 so that it moves left
			dx=-10;
		}
		if(yCoordinate<0){// if touching top screen then velocity changes to 1 so that it moves down
			dy=10;
		}
		else if(yCoordinate>=700-45){// if touching bottom screen then velocity changes to -1 so that it moves up
			dy=-10;
		}
    }
	
	
	
	public static void main(String[] args) {
		
	}

	

	

}
