package xyz.kingnand.test;

import xyz.kingnand.Circle;
import xyz.kingnand.Rectangle;
import xyz.kingnand.Shape;
import xyz.kingnand.ShapeDecorator;

public class Test {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();	// output: Draw a circle
		
		Shape rectangle = new Rectangle();
		rectangle.draw();	// output: Draw a rectangle
		
		Shape circleDecorator = new ShapeDecorator(circle);
		// output: 	Decorator is drawing
		//			Draw a circle
		//			Execution time: xXx(ns)
		circleDecorator.draw();
		
		Shape rectangleDecorator = new ShapeDecorator(rectangle);
		// output: 	Decorator is drawing
		//			Draw a rectangle
		//			Execution time: xXx(ns)
		rectangleDecorator.draw();
		
		}
}

