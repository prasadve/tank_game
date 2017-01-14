package Game;

import javax.swing.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class TheGame1 extends JPanel implements ActionListener{
	
	
	Image background; // Background and the tanks are initilized
	GreenTank tank1;
	RedTank tank2;
	static Boolean ballroll1=false,ballroll2=false;
	RedBall ball1;
	GreenBall ball2;
	Timer timer;
	
	
	Rectangle2D.Double tankBox1; 
	Rectangle2D.Double tankBox2;
	Rectangle2D.Double obstacleBox; 
	
	

	 
	  
	public TheGame1(){
	
		JFrame frame = new JFrame();  // Creates the frame for the game
		frame.setSize(1000,700);
		frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		this.setFocusable(true);
	    tank1= new GreenTank(100,100,0,0,"GreenTankLeft.png");
	    tank2= new RedTank(200,400,0,0,"RedTankRight.png");
	    ball1= new RedBall();
	    ball2= new GreenBall();
	    
	    this.addKeyListener(tank1);
	    this.addKeyListener(tank2);
		
	    timer= new Timer(10,this);
	    timer.start();
	
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		background = kit.getImage("Background.jpg"); 
	
		
		obstacleBox = new Rectangle2D.Double(410,200,60,110);
		
		frame.setVisible(true);
	}

	
	public void paintComponent(Graphics g){
		g.drawImage(background,0,0, 1000, 700, this);
		

		Graphics2D ga = (Graphics2D)g;
		tank1.draw(ga);
		tank2.draw(ga);
		if(ballroll1){
			
			ball1.draw(ga);
		}
		if(ballroll2){
			ball2.draw(ga);
		}
		
		ga.setPaint(Color.black);	
		ga.fill(obstacleBox);
	}
	
	
	
	public static void main(String[] args) {
	}


	@Override
	public void actionPerformed(ActionEvent e) {
        tank1.move();
        tank2.move();
        if(!(ballroll1)){
        	ball1.load();
        }
        if(ballroll1){
        	ball1.launch();
        }
        if(!(ballroll2)){
        	ball2.load();
        }
        if(ballroll2){
        	ball2.launch();
        }
       
        
		repaint();
	}


	
}
   