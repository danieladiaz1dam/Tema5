package Ejercicio03;

/**
 * Representa un punto en un plano de dos dimensiones
 */
public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	private int abCuadrado(int a, int b) {
		return a * a - 2 * a * b + b * b;
	}

	public double distancia(Punto p) {
		return Math.sqrt(abCuadrado(p.x, this.x) + abCuadrado(p.y, this.y));
	}

	@Override
	public String toString() {
		return "(%d, %d)".formatted(this.x, this.y);
	}

}
