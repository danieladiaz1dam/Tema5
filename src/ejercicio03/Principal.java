package ejercicio03;

import java.util.Scanner;

import ejercicio03.Pizza.Tamaño;
import ejercicio03.Pizza.Tipo;

public class Principal {
	final static private Scanner sc = new Scanner(System.in);

	private static int mostrarMenu() {
		int opt = 0;
		System.out.println("\n**Menú de Pizzas**");
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
		System.out.print("Introduzca una opción (1-4): ");
		opt = sc.nextInt();
		sc.nextLine();
		return opt;
	}

	public static Pizza leerPizza() {
		int codigo;

		System.out.print("Introduzca el código de la pizza: ");
		codigo = sc.nextInt();
		sc.nextLine();

		System.out.print("Introduzca el tamaño de la pizza (Mediana/Familiar): ");
		Tamaño tamaño = Tamaño.valueOf(sc.nextLine().toUpperCase());

		System.out.print("Introduzca el tipo de la pizza (Margarita/CuatroQuesos/Funghi): ");
		Tipo tipo = Tipo.valueOf(sc.nextLine().toUpperCase());

		return new Pizza(codigo, tamaño, tipo);
	}

	public static void main(String[] args) {
		int opt = 0;
		Pizza p;
		int codigo;

		do {
			opt = mostrarMenu();

			switch (opt) {
			case 1:
				Pizzeria.listar();
				break;

			case 2:
				p = leerPizza();
				if (Pizzeria.nuevoPedido(p))
					System.out.println("hecho");
				else
					System.out.println("Pizza ya en lista o lista llena");
				break;
				
			case 3:
				System.out.println("Que pizza quieres servir? (codigo)");
				codigo = sc.nextInt();
				sc.nextLine();
				
				p = new Pizza(codigo);
				if (Pizzeria.pizzaServida(p))
					System.out.println("hecho");
				else
					System.out.println("Pizza no encontrada");
				break;
				
			case 4:
				System.out.println("Exit.");
				break;
				
			default:
				System.out.println("Opcion invalida");
				break;
			}

		} while (opt != 4);

		sc.close();
	}
}
