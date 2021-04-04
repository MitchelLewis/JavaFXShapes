package uk.ac.aston.jpd.lab2.drawing.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class FilledRectangle extends Rectangle {
	private final Color fill;
	
	public FilledRectangle(Color fill, double ulX, double ulY, double width, double height) {
		  super(ulX, ulY, width, height);
		  this.fill = fill;
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		super.draw(gc);
	  gc.setFill(fill);
	  gc.fillRect(getX(), getY(), getWidth(), getHeight());
	  
	}
	
	public Color getFill() {
		return fill;
	}
	
	@Override
	public FilledRectangle move(double dx, double dy) {
		return new FilledRectangle(fill, getX() + dx, getY() + dy, getWidth(), getHeight());
	}
}
