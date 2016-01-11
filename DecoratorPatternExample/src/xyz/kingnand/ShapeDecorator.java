package xyz.kingnand;

public class ShapeDecorator implements Shape {

	private Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		System.out.println("Decorator is drawing");
		long startTime = System.nanoTime();
		this.shape.draw();
		long executionTime = System.nanoTime() - startTime;
		System.out.printf("Execution time: %d(ns)\n", executionTime);
	}

}


