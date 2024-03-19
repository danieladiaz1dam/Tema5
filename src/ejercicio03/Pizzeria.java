package ejercicio03;

import ejercicio03.Pizza.Estado;

public class Pizzeria {
	static private Pizza[] pizzas = new Pizza[50];

	static void listar() {
		for (Pizza p : pizzas) {
			if (p != null)
				System.out.println(p);
		}
	}

	private static int buscarHueco() {
		int i = 0, pos = -1;
		boolean enc = false;

		while (i < pizzas.length && !enc) {
			if (pizzas[i] == null) {
				pos = i;
				enc = true;
			}

			i++;
		}

		return pos;
	}

	static int pizzaExists(Pizza p) {
		int i = 0, pos = -1;
		boolean enc = false;

		while (i < pizzas.length && !enc) {
			if (pizzas[i] != null && pizzas[i].equals(p)) {
				pos = i;
				enc = true;
			}
			i++;
		}

		return pos;
	}

	static boolean nuevoPedido(Pizza p) {
		int pos = buscarHueco();
		boolean res = false;

		if (pos >= 0 && pizzaExists(p) == -1) {
			pizzas[pos] = p;
			res = true;
		}

		return res;
	}

	static boolean pizzaServida(Pizza p) {
		int pos = pizzaExists(p);
		boolean enc = false;

		if (pos >= 0) {
			pizzas[pos].setEstado(Estado.SERVIDA);
			enc = true;
		}

		return enc;
	}

}
