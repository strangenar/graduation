import java.awt.*;

public final class ZigZag extends State
{
   
   public ZigZag(Vector2D wayVector)
   {
	  super(wayVector);
   }
   public final void step(Entity entity){
		Vector2D v = entity.position.plus(this.wayVector);
		if (v.x < 10 || entity.common.windowWidth - v.x < 10){
			this.wayVector.x = - this.wayVector.x;
		}
		if (v.y < 10 || entity.common.windowHeight- v.y < 10){
			this.wayVector.y = -this.wayVector.y;
		}		
		entity.position = v;
   }
   public final String toString(){
	   return "ZigZag";
   }
}