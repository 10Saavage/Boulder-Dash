 package Boulderdash.model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author GROUP 8
 *
 */
public class Ground extends ImoObject{
	int x;
	int y;
	Image image;
	
	/**
	 * @param x
	 * @param y
	 */
	public Ground(int x, int y) {
		super(x,y);
		this.setImage(image=new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\sol[1579].png").getImage());
	}
	
}


















