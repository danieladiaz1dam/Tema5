package Ejercicio04;

public class Principal {
	public static void main(String[] args) {
		Articulo art = new Articulo("Articulo", 8.50f, 10);
		art.vender(5);
		art.almacenar(10);
		System.out.print(art);
		System.out.printf("Precio con descuento del 50%%: %.2f", art.getPVPDescuento(.5f));
	}
}
