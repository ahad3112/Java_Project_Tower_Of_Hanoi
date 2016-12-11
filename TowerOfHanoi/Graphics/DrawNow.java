package TowerOfHanoi.Graphics;

/**
 * Implementing the Tower of Hanoi classical algorithm
 * @author Muhammed Ahad
 * e-mail: ahad3112@yahoo.com
 */

import TowerOfHanoi.test.Plate.TowerPlate;
import javax.swing.*;
import java.util.*;

public class DrawNow {

	private JFrame myFrame;
	// checking graphics
	public DrawNow(LinkedList<TowerPlate> plateList){
		myFrame = new JFrame();
		myFrame.add(new DrawGraphics(plateList));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(1000, 1000);
		myFrame.setResizable(true);
		myFrame.setVisible(true);
	}
}
