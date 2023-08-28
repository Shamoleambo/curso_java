package abstractMethodsExercise;

public class Circle extends Shape {
	private Double radius;
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double area() {
		return Math.PI * (Math.pow(this.radius, 2));
	}
	
	public Double getRadius() {
		return this.radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
}
