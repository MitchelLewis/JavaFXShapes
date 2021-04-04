package uk.ac.aston.jpd.lab2.drawing.shapes;

import javafx.scene.canvas.GraphicsContext;

/**
 * Rectangle, specified as upper left corner + width and height. 
 */
public class Rectangle extends Shape {

	public Rectangle(double ulX, double ulY, double width, double height) {
		super(ulX, ulY, width, height);
	}

	@Override
	public void draw(GraphicsContext gc) {
		gc.setLineWidth(5);
		gc.strokeRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public Rectangle move(double dx, double dy) {
		return new Rectangle(getX() + dx, getY() + dy, getWidth(), getHeight());
	}

}
