package helloworld;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CustomPaint extends JPanel {
	
	public static void main(String[] args) {
		
		public CustomPaint() {
			setBorder(BorderFactory.createLineBorder(Color.black));
		
		}
		
		public Dimension getPreferredSize() {
			return new Dimension(250,200);
		}
		public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
		
		g.drawString("This is a Custom Drawing area", 10, 20);
		
		
	

	
	JFrame f = new JFrame("Swing Paint Demo");
	
	f.add(new CustomPaint());
	f.pack();
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(250,250);
	f.setVisible(true);
		
		
		}
	}
