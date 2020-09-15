import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
public final class Speaker extends Entity
{
	public Speaker(String name,Vector2D position, State state, Common common, String filename)
	{
		super(name,position,state,common,filename);
	}
   public void draw(Graphics2D g2d)
   {
	   g2d.setColor(Color.BLUE);
	   g2d.drawOval((int)this.position.x,(int)this.position.y,10,10);
	   g2d.drawString(this.name,(int)this.position.x - 10,(int)this.position.y);
	   g2d.drawString(this.state.toString(),(int)this.position.x + 10,(int)this.position.y);
   }
}
