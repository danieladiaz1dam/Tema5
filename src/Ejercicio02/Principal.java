package Ejercicio02;

public class Principal {
	public static void main(String[] args) {
		Libro libro = new Libro("titulo", "autor", 5, 0);
		System.out.println(libro.devolucion() ? "libro vuelto" : "No se pudo devolver");
		System.out.println(libro.prestamo() ? "prestado" : "no se pudo prestar");
		System.out.println(libro.devolucion() ? "libro vuelto" : "No se pudo devolver");
		System.out.println(libro.prestamo() ? "prestado" : "no se pudo prestar");
		System.out.println(libro.prestamo() ? "prestado" : "no se pudo prestar");
		System.out.println(libro);
	}
}
