import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.awt.image.BufferedImage;
public final class Academician extends Entity
{
    private BufferedImage background;
    public Academician(String name, Vector2D position, State state, Common common, String filename){
        super(name, position, state, common,filename);
        try{
            this.background = ImageIO.read(new File(filename));
        } catch (IOException e) {
            System.out.print("Filename incorrect! Filename:" + filename + "\n");
        }
    }
   public void draw(Graphics2D g2d)
   {
	   g2d.drawImage(this.background, (int)this.position.x, (int)this.position.y, 40, 54, null);
	   g2d.drawString(this.name,(int)this.position.x ,(int)this.position.y );
	   g2d.drawString(this.state.toString(),(int)this.position.x,(int)this.position.y + 60);
   }
}