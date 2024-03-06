package Ejercicio02;

/**
 * Guarda informacion de un libro
 */
public class Libro {
	private String titulo = "";
	private String autor = "";
	private int ejemplares = 0;
	private int prestados = 0;

	/**
	 * Constructor vacío
	 */
	public Libro() {
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null)
			this.titulo = titulo;

		if (autor != null)
			this.autor = autor;

		if (ejemplares > 0)
			this.ejemplares = ejemplares;

		if (prestados > 0)
			this.prestados = prestados;
	}

	/**
	 * Presta un libro si es posible
	 * 
	 * @return true si es posible, false en caso contrario
	 */
	public boolean prestamo() {
		boolean prestado = false;

		if (this.ejemplares > this.prestados) {
			this.prestados++;
			prestado = true;
		}

		return prestado;
	}

	/**
	 * Devolver u nlibro si es posible
	 * 
	 * @return true si es posible, false en caso contrario
	 */
	public boolean devolucion() {
		boolean devolucion = false;

		if (this.prestados > 0) {
			this.prestados--;
			devolucion = true;
		}

		return devolucion;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}

}
