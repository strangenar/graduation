import static java.lang.Math.*;

public final class Vector2D
{
   public double x;
   public double y;
   public Vector2D(double x,double y)
   {
		this.x = x;
		this.y = y;
   }
   public void set(Vector2D v)
   {
	   this.x = v.x;
	   this.y = v.y;
	   
   }
   public double distanceTo(Vector2D other)
   {
	   return sqrt((this.x - other.x)*(this.x - other.x) + (this.y - other.y)*(this.y - other.y));
   }
   public Vector2D normalize()
   {
	   double len;
	   Vector2D nv = new Vector2D(0,0);
	   len = distanceTo(nv);
	   nv.x = 50*this.x/len;
	   nv.y = 50*this.y/len;
	   return nv;
   }
   public Vector2D plus(Vector2D other)
   {
	   double nx,ny;
	   nx = other.x + this.x;
	   ny = other.y + this.y;
	   Vector2D nv = new Vector2D(nx,ny);
	   return nv;
   }
	public Vector2D minus(Vector2D other)
   {
	   double nx,ny;
	   nx = this.x - other.x;
	   ny = this.y - other.y;
	   Vector2D nv = new Vector2D(nx,ny);
	   return nv;
   }
}