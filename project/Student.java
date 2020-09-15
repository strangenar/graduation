import javax.swing.*;
public final class Student extends Entity
{
   public int grade;
   public void draw(Graphics2D g2d)
   {
	   g2d.setPain(Color.BLUE);
	   g2d.drawOval(this.position.x,this.postion.y,10,10);
	   g2d.drawString((String)this.grade,this.position.x,this.position.y);
	   g2d.drawString(this.name,this.position.x - 10,this.position.y);
	   g2d.drawString(this.state.toString(),this.position.x + 10,this.position.y);
   }
}