package Game;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.geom.*;

public class GreenTank implements KeyListener{

	
    int height,width;
    Image tank;
    static int xCoordinate,yCoordinate;
    static int dx,dy;
    Toolkit kit = Toolkit.getDefaultToolkit();
  

    public GreenTank(int x, int y,int velx,int vely, String image) {
        xCoordinate=x;
        yCoordinate=y;
        dx=velx;
        dy=vely;
        Toolkit kit = Toolkit.getDefaultToolkit();
        tank= kit.getImage(image);
    }
    public void move(){
    	xCoordinate+=dx;
    	yCoordinate+=dy;
    }

    public static int getX() {
        return xCoordinate;
    }

    public static int getY() {
        return yCoordinate;
    }
    public static int getdx(){
    	return dx;
    }
    public static int getdy(){
    	return dy;
    }
    public Image getImage() {
        return tank;
    }
    public void draw(Graphics2D g){
    	g.drawImage(getImage(), xCoordinate, yCoordinate,null);
    }

	@Override
	public void keyPressed(KeyEvent e) {
		int key=e.getKeyCode();
		if(key == KeyEvent.VK_UP){
			dy=-2;
			tank = kit.getImage("GreenTankUp.png");
		}
		if(key == KeyEvent.VK_DOWN){
			dy=2;
			tank = kit.getImage("GreenTankDown.png");
		}
		
		if(key == KeyEvent.VK_LEFT){
			dx=-2;
			tank = kit.getImage("GreenTankLeft.png");
		}
		if(key == KeyEvent.VK_RIGHT){
			dx=2;
			tank = kit.getImage("GreenTankRight.png");
		}
		if(key == KeyEvent.VK_P){
			TheGame1.ballroll2=true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();
		if(key == KeyEvent.VK_UP){
			dy=0;
			tank = kit.getImage("GreenTankUp.png");
		}
		if(key == KeyEvent.VK_DOWN){
			dy=0;
			tank = kit.getImage("GreenTankDown.png");
		}
		
		if(key == KeyEvent.VK_LEFT){
			dx=0;
			tank = kit.getImage("GreenTankLeft.png");
		}
		if(key == KeyEvent.VK_RIGHT){
			dx=0;
			tank = kit.getImage("GreenTankRight.png");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
    
}

