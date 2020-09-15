import javax.swing.*;
public final class Academician extends Entity
{
    public Academician(String name, Vector2D position, State state, Common common, String filename){
        super(name, position, state, common,filename);
        try{
            background = ImageIO.read(new File(filename));
        } catch (IOException e) {
        }
    }
   public void draw(Graphics2D g2d)
   {
	   g2d.setPain(Color.BLUE);
	   g2d.drawImage(background, 0, 0, 20, 27, null);
	   g2d.drawString(this.name,this.position.x - 10,this.position.y);
	   g2d.drawString(this.state.toString(),this.position.x + 10,this.position.y);
   }
}