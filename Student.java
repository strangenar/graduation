import java.awt.Graphics2D;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
public final class Student extends Entity
{
   public int grade = 0;
	public Student(String name,Vector2D position, State state, Common common, String filename)
	{
		super(name,position,state,common,filename);
	}
   public void draw(Graphics2D g2d)
   {
	   // g2d.setColor(Color.BLUE);
	   // g2d.drawOval((int)this.position.x,(int)this.position.y,25,25);
	   // g2d.drawString(Integer.toString(this.grade),(int)this.position.x,(int)this.position.y);
	   // g2d.drawString(this.name,(int)this.position.x,(int)this.position.y - 50 );
	   // g2d.drawString(this.state.toString(),(int)this.position.x ,(int)this.position.y + 50);

		Font font = g2d.getFont();
      g2d.setFont(new Font("New Font", 1, 14));
      FontMetrics fmetr = g2d.getFontMetrics();
      AffineTransform transf = g2d.getTransform();
      g2d.translate((int)this.position.x, (int)this.position.y);
      if (this.grade >= 100) {
         g2d.setPaint(Color.MAGENTA);
      } else {
         g2d.setPaint(Color.CYAN);
      }

      g2d.fillOval(-15, -15, 30, 30);
      g2d.setPaint(Color.BLACK);
      g2d.drawOval(-15, -15, 30, 30);
      g2d.setPaint(Color.BLACK);
      g2d.drawString(this.state.toString(), (int)((double)(-fmetr.stringWidth(this.state.toString())) / 2.0D) + 1, -18);
      g2d.setPaint(Color.BLACK);
      g2d.drawString(Integer.toString(this.grade), (int)((double)(-fmetr.stringWidth(Integer.toString(this.grade))) / 2.0D) + 1, 6);
      g2d.setPaint(Color.BLACK);
      g2d.drawString(this.name, (int)((double)(-fmetr.stringWidth(this.name)) / 2.0D) + 1, 30);
      g2d.setTransform(transf);
      g2d.setFont(font);
   }
}