
public abstract class Assessment extends Entity {
    public int num;
    public Assessment(String name, Vector2D position, State state, Common common, int num){
         super(name, position, state, common,"");
         this.num = num;
   }
}
