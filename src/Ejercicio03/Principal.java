package Ejercicio03;

public class Principal {
	public static void main(String[] args) {
		Punto p = new Punto(1, 1);
		p.setXY(10, 10);
		p.desplaza(-5, 5);
		System.out.println(p);
		System.out.println(p.distancia(new Punto(20, 20)));
	}
}
