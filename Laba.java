import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

// $FF: renamed from: k
public final class Laba extends Assessment {
   public Laba(String name,Vector2D position, State state, Common common, int num) {
      super(String name,Vector2D position, State state, Common common, int num);
   }
   public final void draw(Graphics2D g2d) {
      Font var2 = var1.getFont();
      var1.setFont(new Font("New Font", 1, 14));
      FontMetrics fmetr = var1.getFontMetrics();
      AffineTransform transf = var1.getTransform();
      var1.translate((int)this.position.x, (int)this.position.y);
      var1.setPaint(Color.RED);
      var1.fillOval(-9, -9, 18, 18);
      String stateName = this.state.toString();
      var1.setPaint(Color.BLACK);
      var1.drawString(stateName, (int)((double)(-fmetr.stringWidth(stateName)) / 2.0D) + 1, 6);
      var1.setTransform(transf);
      var1.setFont(font);
   }
}

