package Boulderdash.model;

import java.awt.Image;

/**
 * @author GROUP 8
 *GENERALISATION MOBILE OBJECTS
 */
public class MobileObject {
	int x;
	int y;
	Image image;
	
	public MobileObject(int x, int y) {
		super();
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
}
