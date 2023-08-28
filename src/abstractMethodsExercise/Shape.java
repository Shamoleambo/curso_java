package abstractMethodsExercise;

public abstract class Shape {
	private Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract Double area();
}
