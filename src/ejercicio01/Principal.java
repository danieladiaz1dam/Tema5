package ejercicio01;

import java.util.Scanner;

public class Principal {
	static final Scanner sc = new Scanner(System.in);

	public static int menu() {
		int opt = 0;

		System.out.println("ALUMNOS/AS\n" + "===================\n" + "1. Listado.\n" + "2. Nuevo Alumno.\n"
				+ "3. Modificar.\n" + "4. Borrar.\n" + "5. Salir.");

		System.out.printf(" > ");
		opt = sc.nextInt();
		sc.nextLine();

		return opt;
	}

	public static void main(String[] args) {
		ListadoAlumnos listaAlumnos = new ListadoAlumnos();

		// atributos de alumnos
		Alumno al;
		float notaMedia;
		String nombre = "";

		// menu
		int opt = 0;
		
		do {
			opt = menu();

			switch (opt) {
			case 1:
				listaAlumnos.listAlumnos();
				break;

			case 2:
				System.out.println("Nombre del alumno:");
				nombre = sc.nextLine();
				System.out.println("Nota media:");
				notaMedia = sc.nextFloat();
				sc.nextLine();

				al = new Alumno(nombre, notaMedia);

				if (!listaAlumnos.addAlumno(al)) {
					System.out.println("Alumno no añadido, la lista esta llena");
				}

				break;

			case 3:
				System.out.println("Que alumno quieres modificar?");
				nombre = sc.nextLine();
				System.out.println("Nota media:");
				notaMedia = sc.nextFloat();
				sc.nextLine();

				if (!listaAlumnos.modifyAlumno(nombre, notaMedia)) {
					System.out.println("Alumno no encontrado");
				}

				break;

			case 4:
				System.out.println("Que alumno quieres borrar?");
				nombre = sc.nextLine();

				if (!listaAlumnos.deleteAlumno(nombre)) {
					System.out.println("Alumno no encontrado");
				}
				
				break;
			}
		} while (opt != 5);

		sc.close();
	}
}
