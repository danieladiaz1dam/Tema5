package Ejercicio01;

public class CuentaCorriente {
	private String DNI;
	private String nombre;
	private float saldo = 0.f;

	public CuentaCorriente(String DNI, float saldo) {
		if (DNI != null && DNI.trim().length() > 0 && DNI.trim().length() <= 9)
			this.DNI = DNI;
		else
			System.out.println("DNI INVALIDO");

		if (!ingresarDinero(saldo))
			System.out.println("SUELDO INVALIDO");
	}

	public CuentaCorriente(String DNI, String nombre, float saldo) {
		if (DNI != null && DNI.trim().length() > 0 && DNI.trim().length() <= 9)
			this.DNI = DNI;
		else
			System.out.println("DNI INVALIDO");
		
		if (nombre != null && !nombre.trim().equals(""))
			this.nombre = nombre;
		else
			System.out.println("NOMBRE INVALIDO");

		if (!ingresarDinero(saldo))
			System.out.println("SUELDO INVALIDO");
	}

	/**
	 * Resta una cantidad al saldo actual
	 * 
	 * @param cantidad Cantidad para restar
	 * @return true si se puede sacar esa cantidad, false en caso contrario
	 */
	public boolean sacarDinero(float cantidad) {
		if (cantidad > this.saldo)
			return false;

		this.saldo -= cantidad;
		return true;
	}

	/**
	 * Ingresa una cantidad de dinero a la cuenta
	 * 
	 * @param cantidad Cantidad a ingresar
	 * @return true si se pudo ingresar la cantidad, false en caso contrario
	 */
	public boolean ingresarDinero(float cantidad) {
		if (cantidad < 0)
			return false;

		this.saldo += cantidad;
		return true;
	}

	/**
	 * Muestra la información de la cuenta
	 */
	public void monstrarInformacion() {
		System.out.printf("Titular de la cuenta: %s\nDNI: %s\nSaldo: %.2f\n\n", this.nombre, this.DNI, this.saldo);
	}
}
