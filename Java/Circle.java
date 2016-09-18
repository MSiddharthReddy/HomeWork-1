package queue;

public class Circle implements Area{
	int r;

	Circle(int radius) {
		this.r = radius;
	}
	@Override
	public double calculate() {
		double area = Math.PI * r * r;
		return area;
	}
}
