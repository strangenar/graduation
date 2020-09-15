
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import javax.swing.*;
public abstract class Entity
{
   public String name;
   public Vector2D position;
   public State state;
   public Common common;
   public Entity(String name,Vector2D position, State state, Common common, String filename)
   {
		this.name = name;
		this.common = common;
		this.position = position;
		this.state = state;
   }
   public void draw(Graphics2D g2d)
   {
   }
   public void step()
   {
	   this.state.step(this);
   }
}