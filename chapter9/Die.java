import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.*;

public class Die extends JLabel {
	static Border black = BorderFactory.createLineBorder(Color.black);
	static Border red = BorderFactory.createLineBorder(Color.red);
	
    int num;
    public Die() {
        roll();
		setBorder(black);
    }
    
    public void roll() {
        num = (int)(6 * Math.random()) + 1;
		changeIcon();
    }
    
    public int getRoll() {
        return num;
    }
    
    public String toString() {
        return String.valueOf(num);
    }
	
	public void changeIcon() {
		ImageIcon icon = new ImageIcon(String.valueOf(num) + ".png");
		icon = getScaledImage(icon, 50, 50);
		setIcon(icon);
	}
	private ImageIcon getScaledImage(ImageIcon srcImg, int w, int h){
		BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImg.createGraphics();
	
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(srcImg.getImage(), 0, 0, w, h, null);
		g2.dispose();
	
		return new ImageIcon(resizedImg);
	}
}

