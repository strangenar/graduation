
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class UniversityMap extends Entity {
    private BufferedImage background;

    public UniversityMap(String name, Vector2D position, State state, Common common, String filename){
        super(name, position, state, common,filename);
        try{
            background = ImageIO.read(new File(filename));
        } catch (IOException e) {

        }
    }

    @Override
    public void draw(Graphics2D g2d){
        g2d.drawImage(background, 0, 0, common.windowWidth, common.windowHeight, null);
    }
}



