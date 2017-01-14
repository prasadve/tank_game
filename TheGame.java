package Game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.net.URL;

public class TheGame extends JFrame implements ActionListener, ItemListener {
	static TheGame1 gui;
	ImageIcon volume = new ImageIcon("Volumepix.jpg");
	ImageIcon mute = new ImageIcon("Mutepix.jpg");
	
	ImageIcon startpic = new ImageIcon("Startpix.jpg");
	JButton start = new JButton (startpic);
	JButton music = new JButton (volume);
	gamePanel background= new gamePanel();
	TheGame1 game= new TheGame1();
	
	
	
	URL url = TheGame.class.getResource("gameover.wav"); // gets the file from the directory.
	AudioClip clip = Applet.newAudioClip(url); // variable "clip" now has the info of the file.
	 
	 
	 
	public TheGame(){
		super("Tank");
		setSize(1000,700);
		setResizable(true);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		gamePanel background = new gamePanel();
		
		game.setVisible(false);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		background.add(start);
		start.setBounds(450,500,100,100);
		start.setActionCommand("start");
		
		background.add(music);
		music.setActionCommand("music");
		music.setBounds(550,500,100,70);

		music.addActionListener(this);
		start.addActionListener(this);
		
		background.setLayout(null);
		add(background);
		setVisible(true);
		
	}
	
	
	public void itemStateChanged(ItemEvent event){
		
	}
	

	public void actionPerformed(ActionEvent event){
		String eventName = event.getActionCommand();
		
		if(eventName.equals("start")){
			 music.setVisible(false);
			 start.setVisible(false);
			 background.setVisible(false);
			 game.setVisible(true);
			 
	         dispose();
		}
		  if( eventName.equals("music")) 
		  {
		   int n = JOptionPane.showConfirmDialog(background,"Would you like to listen to music?","Music",JOptionPane.YES_NO_OPTION);
		   if (n == JOptionPane.NO_OPTION)
		   {
			   clip.stop();
		   }
		   else if (n == JOptionPane.YES_OPTION)
		   {
			   clip.loop(); 
		   }
		  }
	}
	
	private JButton JButton(ImageIcon mute2) {
	
		return null;
	}


	public static void main(String[] args) 
	 {
	  TheGame giu= new TheGame();
	 }
}

