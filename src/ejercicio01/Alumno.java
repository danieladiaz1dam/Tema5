package ejercicio01;

/**
 * Hace referencia a un alumno, guardando su nombres y su nota media
 */
public class Alumno {
	private String nombre;
	private float notaMedia;

	public Alumno() {
	}

	public Alumno(String nombre, float notaMedia) {
		if (nombre != null)
			this.nombre = nombre;
		if (notaMedia >= 0)
			this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null)
			this.nombre = nombre;
	}

	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		if (notaMedia >= 0)
			this.notaMedia = notaMedia;
	}
	
	@Override
		public String toString() {
		return "%s %.2f".formatted(this.nombre, this.notaMedia);
		}
}
