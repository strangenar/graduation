import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

import javax.swing.*;
//package MainWindow.MainWindow;




class Display extends JPanel{
	public Entity entity;
	
	public Display(Entity entity){
		this.entity = entity;
	}
	public Dimension getPreferedSize(){
		return new Dimension(800,400);
	}
	public void paintComponent(Graphics g)
	{ 
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g; 
		this.entity.draw(g2d); 
	}
}

public class NUProject{
    public static void main(String [] args){
		JFrame window = new JFrame();
		
		
		window.setSize(800, 400);
		window.setTitle("NUGrad by prinnevald");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		State state = new Stationary();
		Vector2D vector = new Vector2D(0,0);
		Common common = new Common();
		Entity map = new UniversityMap("NUMap",vector,state,common,"Demo/NUMap-  d.jpg");
		Display display = new Display(map);
		window.setLayout(new BorderLayout());
		window.add(display, BorderLayout.CENTER);
		window.setVisible(true);
	
    }
}