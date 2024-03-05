package Ejercicio02;

/**
 * Guarda informacion de un libro
 */
public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;

	public Libro() {
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	/**
	 * Presta un libro si es posible
	 * @return true si es posible, false en caso contrario
	 */
	public boolean prestamo() {
		if (this.ejemplares < this.prestados)
			return false;

		this.prestados++;
		this.ejemplares--;
		return true;
	}
	
	/**
	 * Devolver u nlibro si es posible
	 * @return true si es posible, false en caso contrario
	 */
	public boolean devolucion() {
		if (this.prestados <= 0)
			return false;
		
		this.prestados--;
		this.ejemplares++;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
	
	
}
