package Game;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.geom.*;

public class RedTank implements KeyListener{

	
    int height,width;
    static int xCoordinate,yCoordinate,dx=1,dy=1;
    Image tank;
    Toolkit kit = Toolkit.getDefaultToolkit();
  

    public RedTank(int x, int y,int velx,int vely, String image) {
        xCoordinate=x;
        yCoordinate=y;
        dx=velx;
        dy=vely;
     
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
		if(key == KeyEvent.VK_W ){
			dy=-2;
			tank = kit.getImage("RedTankUp.png");
		}
		else if(key == KeyEvent.VK_S){
			dy=2;
			tank = kit.getImage("RedTankDown.png");
		}
		else if(key == KeyEvent.VK_A){
			dx=-2;
			tank = kit.getImage("RedTankLeft.png");
		}
		
		else if(key == KeyEvent.VK_D){
			dx=2;
			tank = kit.getImage("RedTankRight.png");
		}
		else if(key == KeyEvent.VK_SPACE){
			TheGame1.ballroll1=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key=e.getKeyCode();
		if(key == KeyEvent.VK_W){
			dy=0;
			tank = kit.getImage("RedTankUp.png");
		}
		else if(key == KeyEvent.VK_S){
			dy=0;
			tank = kit.getImage("RedTankDown.png");
		}
		else if(key == KeyEvent.VK_A){
			dx=0;
			tank = kit.getImage("RedTankLeft.png");
		}
		
		else if(key == KeyEvent.VK_D){
			dx=0;
			tank = kit.getImage("RedTankRight.png");
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
    
}

