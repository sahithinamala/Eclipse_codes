package tour.and.travel.management.system;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JPanel{
	 public void paintComponent(Graphics g){
	        Image image = new ImageIcon("C:\\Users\\namal\\eclipse-workspace\\Tour and Travel management System\\src\\tour\\and\\travel\\management\\system\\img\\earth.jpg").getImage();
	        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
	        Font font = new Font("Arial", Font.BOLD, 40);
	        
	        g.setFont(font);
	        
	        g.setColor(Color.WHITE);
	       
	        g.drawString("LOGIN", 500, 500);
	        
	        
	    }
	
	
public static void main(String[]args) {
	  JFrame frame = new JFrame();
      
	  JTextField textField = new JTextField();
	  textField.setBounds(100, 100, 100, 100);
     
      
     
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      primary pr = new primary();
      frame.add(textField); 
      frame.add(pr);
     

      frame.setVisible(true);
}

}
