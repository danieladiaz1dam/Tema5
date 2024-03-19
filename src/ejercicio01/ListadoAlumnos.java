package ejercicio01;

/**
 * Opera sobre una lista de alumnos
 */
public class ListadoAlumnos {
	private Alumno[] alumnos;

	public ListadoAlumnos() {
		this.alumnos = new Alumno[30];
	}

	public boolean addAlumno(Alumno al) {
		boolean done = false;
		int index = 0;

		while (!done && index < this.alumnos.length) {
			if (this.alumnos[index] == null) {
				this.alumnos[index] = al;
				done = true;
			}
			index++;
		}

		return done;
	}

	public void listAlumnos() {
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.alumnos[i] != null)
				System.out.println(i + 1 + " " + this.alumnos[i]);
		}
		System.out.println();
	}

	public boolean modifyAlumno(String nombre, float notaMedia) {
		boolean done = false;
		int index = 0;

		while (!done && index < this.alumnos.length) {
			if (this.alumnos[index].getNombre().equals(nombre)) {
				this.alumnos[index].setNotaMedia(notaMedia);
				done = true;
			}
			index++;
		}

		return done;
	}

	public boolean deleteAlumno(String nombre) {
		boolean done = false;
		int index = 0;

		while (!done && index < this.alumnos.length) {
			if (this.alumnos[index].getNombre().equals(nombre)) {
				this.alumnos[index] = null;
				done = true;
			}
			index++;
		}

		return done;
	}

}
