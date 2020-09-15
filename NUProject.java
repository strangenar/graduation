import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

import javax.swing.*;
//package MainWindow.MainWindow;




class Display extends JPanel{
	public Common common;
	
	public Display(Common common){
		this.common = common;
	}
	public Dimension getPreferedSize(){
		return new Dimension(800,400);
	}
	public void paintComponent(Graphics g)
	{ 
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g; 
		this.common.drawAllEntities(g2d);
	}
}

public class NUProject{
    public static void main(String [] args) throws InterruptedException {
			JFrame window = new JFrame();
			Common common = new Common();
			Display display = new Display(common);

			//window.setLayout(new BorderLayout());
			window.add(display);
			window.setSize(800, 400);
			window.setTitle("NUGrad by prinnevald");
			window.setLocationByPlatform(true);
			window.setResizable(false);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			
			while(true){
				common.stepAllEntities();
				display.repaint();
				System.out.print("Step!\n");
				Thread.sleep(1000);
			}
	
    }
}