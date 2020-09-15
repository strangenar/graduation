
public abstract class State
{
   public boolean isOver;
   public boolean isVisible;
   public Vector2D wayVector;
   public State(Vector2D wayVector)
   {
		 this.wayVector = wayVector.normalize();
   }
   public void step(Entity entity){}
}
