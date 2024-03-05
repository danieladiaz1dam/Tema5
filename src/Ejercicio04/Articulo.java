package Ejercicio04;

/**
 * Clase que representa articulos en un almacen
 */
public class Articulo {
	private String nombre;
	private float precio;
	final private float IVA = .21f;
	private int cuantosQuedan;

	public Articulo(String nombre, float precio, int cuantosQuedan) {
		if (nombre == null || nombre.trim().equals("")) {
			this.nombre = "";
			System.out.println("Nombre invalido");
		} else
			this.nombre = nombre;

		if (precio < 0) {
			this.precio = 0;
			System.out.println("Precio invalido");
		} else
			this.precio = precio;

		if (cuantosQuedan < 0) {
			this.cuantosQuedan = 0;
			System.out.println("CuantosQuedan invalido");
		}

		else
			this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Calcula el precio de venta de un producto con el IVA del 21%
	 * 
	 * @return
	 */
	public float getPVP() {
		return this.precio + this.precio * this.IVA;
	}

	/**
	 * Devuelve el precio de un producto con un descuento aplicado
	 * 
	 * @param descuento (0~1)
	 * @return precio con descuento e IVA
	 */
	public float getPVPDescuento(float descuento) {
		return (this.precio + this.precio * this.IVA) * descuento;
	}

	/**
	 * Vende cierta cantidad de un producto
	 * 
	 * @param cantidad cantidad a vender
	 * @return true si es posible, false en caso contrario
	 */
	public boolean vender(int cantidad) {
		if (this.cuantosQuedan < cantidad)
			return false;

		this.cuantosQuedan -= cantidad;
		return true;
	}

	/**
	 * Almacena una cantidad de productos. Solo si esta e smayor que 0
	 * 
	 * @param cantidad Cantidad para almacenar
	 */
	public void almacenar(int cantidad) {
		if (cantidad > 0)
			this.cuantosQuedan += cantidad;
	}

	@Override
	public String toString() {
		String str = "";

		str += "Articulo:\n";
		str += "Nombre: %s\n".formatted(this.nombre);
		str += "Precio: %.2f\nPrecio con IVA: %.2f\n".formatted(this.precio, this.precio + this.precio * this.IVA);
		str += "Quedan: %d\n".formatted(this.cuantosQuedan);

		return str;
	}

}
