import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarStage extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	static int counter = 0;
	
	MutableCar theCar = new MutableCar(0, 0, Color.CYAN, 10, 1);
	
	public void paintComponent (Graphics g) {
	
		
		theCar.setPosition(
				theCar.getXPos()+theCar.getHorizontalDirection()*theCar.getHorizontalSpeed(), theCar.getYPos());
		
		
		theCar.draw(g);				
		System.out.println(counter++);
	}
}
