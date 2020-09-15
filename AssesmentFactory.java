public abstract class AssessmentFactory {

   public Common comon;

   public abstract Assessment createAssesment(Vector2D position);

   public AssessmentFactory(Common common) {
      this.common = common;
   }
}
