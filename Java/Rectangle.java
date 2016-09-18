package queue;

public class Rectangle implements Area{
	int l;
	int b;

	Rectangle(int length, int bredth) {
		this.l = length;
		this.b = bredth;
	}
	@Override
	public double calculate() {
		return (l * b);
	}
}
