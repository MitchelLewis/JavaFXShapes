package uk.ac.aston.jpd.lab2.drawing.shapes;

import javafx.scene.canvas.GraphicsContext;

/**
 * Circle, specified as center + radius. 
 */
public class Circle extends Shape {

	public Circle(double centerX, double centerY, double radius) {
		super(centerX, centerY, radius * 2, radius * 2);
	}

	public double getRadius() { return getWidth() / 2 ; }
	
	@Override
	public void draw(GraphicsContext gc) {
		gc.strokeOval(getX(), getY(), getWidth() / 2, getWidth() / 2);
	}
	
	@Override
	public Circle move(double dx, double dy) {
		return new Circle(getX() + dx, getY() + dy, getWidth() / 2);
	}

}
