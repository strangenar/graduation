public final class ZigZag extends State
{

   public ZigZag()
   {
   }
   public final void step(Entity entity){
		Vector2D v = entity.position.plus(entity.position.normalize())
		if (v.x < 10) || (entity.common.windowHeight - v.x < 10){
			v.x = -v.x;
		}
		if (v.y < 10) || (entity.common.windowWidth - v.y < 10){
			v.y = -v.y;
		}		
		entity.position = v;
   }
   public final String toString(){
	   return "ZigZag";
   }
}