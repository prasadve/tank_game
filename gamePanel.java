package Game;

import java.awt.*;
import javax.swing.*;
public class gamePanel extends JPanel  {
    Image  background;
  
    public gamePanel() {
        super();
        Toolkit kit = Toolkit.getDefaultToolkit();
        background = kit.getImage("Title.jpg"); 
    }

    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.drawImage(background, 0, 0,1000,700, this);
      
    }
}
