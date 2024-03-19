package ejercicio03;

/**
 * Esta clase define una pizza con sus características y estado.
 */
public class Pizza {

	/**
	 * ID de la pizza
	 */
	private int codigo;

	/**
	 * Los únicos valores que puede tener son Mediana o Familiar.
	 */
	private Tamaño tamaño;

	/**
	 * Los únicos valores que puede tener son Margarita, CuatroQuesos o Funghi.
	 */
	private Tipo tipo;

	/**
	 * Los posibles valores son Pedida o Servida.
	 */
	private Estado estado;

	public Pizza() {
		this.estado = Estado.PEDIDA;
	}
	
	public Pizza(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Constructor de la clase Pizza.
	 *
	 * @param codigo El código de la pizza.
	 * @param tamaño El tamaño de la pizza (Mediana o Familiar).
	 * @param tipo   El tipo de pizza (Margarita, CuatroQuesos o Funghi).
	 * @param estado El estado de la pizza (Pedida o Servida).
	 */
	public Pizza(int codigo, Tamaño tamaño, Tipo tipo) {
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = Estado.PEDIDA;
	}

	/**
	 * Obtiene el código de la pizza.
	 *
	 * @return El código de la pizza.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Establece el código de la pizza.
	 *
	 * @param codigo El nuevo código de la pizza.
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obtiene el tamaño de la pizza.
	 *
	 * @return El tamaño de la pizza (Mediana o Familiar).
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * Establece el tamaño de la pizza.
	 *
	 * @param tamaño El nuevo tamaño de la pizza (Mediana o Familiar).
	 */
	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * Obtiene el tipo de la pizza.
	 *
	 * @return El tipo de la pizza (Margarita, CuatroQuesos o Funghi).
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo de la pizza.
	 *
	 * @param tipo El nuevo tipo de la pizza (Margarita, CuatroQuesos o Funghi).
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * Obtiene el estado de la pizza.
	 *
	 * @return El estado de la pizza (Pedida o Servida).
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Establece el estado de la pizza.
	 *
	 * @param estado El nuevo estado de la pizza (Pedida o Servida).
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * Representación textual de la pizza.
	 *
	 * @return La información de la pizza en formato de cadena.
	 */
	@Override
	public String toString() {
		return "[%d] Pizza %s de %s %s".formatted(this.codigo, this.tamaño, this.tipo, this.estado);
	}

	@Override
	public boolean equals(Object obj) {
		Pizza p = (Pizza) obj;

		return this.codigo == p.codigo;
	}

	/**
	 * Enumeración de los posibles tamaños de pizza.
	 */
	public enum Tamaño {
		MEDIANA, FAMILIAR
	}

	/**
	 * Enumeración de los posibles tipos de pizza.
	 */
	public enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	/**
	 * Enumeración de los posibles estados de la pizza.
	 */
	public enum Estado {
		PEDIDA, SERVIDA
	}
}