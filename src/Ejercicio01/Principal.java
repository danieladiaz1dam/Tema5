package Ejercicio01;

import java.util.Scanner;

public class Principal {
	final static Scanner sc = new Scanner(System.in);

	public static int printMenu() {
		int opt = 0;
		System.out.println("1) Ingresar Dinero");
		System.out.println("2) Retirar Dinero");
		System.out.println("3) Monstrar Informacion de la Cuenta");
		System.out.println("4) Salir");

		opt = sc.nextInt();

		return opt;
	}

	public static void main(String[] args) {
		CuentaCorriente cuenta;
		int menu = 0;
		String nombre;
		String DNI;
		float dinero;

		System.out.println("Cual es tu nombre?");
		nombre = sc.nextLine();
		System.out.println("Cual es tu DNI?");
		DNI = sc.nextLine();
		System.out.println("Cual es tu saldo inicial?");
		dinero = sc.nextFloat();

		cuenta = new CuentaCorriente(DNI, nombre, dinero);

		do {
			menu = printMenu();

			switch (menu) {
			case 1:
				System.out.println("Que cantidad quieres ingresar?");
				dinero = sc.nextFloat();

				if (!cuenta.ingresarDinero(dinero))
					System.out.println("Cantidad invalida");

				break;
			case 2:
				System.out.println("Que cantidad quieres retirar?");
				dinero = sc.nextFloat();

				if (!cuenta.sacarDinero(dinero))
					System.out.println("Cantidad invalida");

				break;

			case 3:
				System.out.println("Informacion de la cuenta:");
				cuenta.monstrarInformacion();
			}

		} while (menu != 4);

		sc.close();
	}
}
