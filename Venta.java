import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
	
	public ArrayList<Producto> ticket;
	public ArrayList<Ticket> historial;

	public void venta() {

		Scanner input = new Scanner(System.in);
		System.out.println("¿Qué producto desea comprar? 1. Árbol. 2. Flor. 3. Deco. 4. Salir");
		int respuesta = input.nextInt();

		switch (respuesta) {

		case 1:
			comprarArbol();
			break;

		case 2:
			comprarFlor();
			break;

		case 3:
			comprarDeco();
			break;

		case 4:
			generadorTicket();
			break;

		default:
			System.out.println("Teclee un producto válido.");
		}

	}

	public ArrayList<Producto> generadorTicket() {

	}

	public void comprarArbol() {

		ArrayList<Arboles> a;

		Scanner input = new Scanner(System.in);

		System.out.println("Indique id.");
		int id = input.nextInt();
		System.out.println("Indique cantidad.");
		int cantidad = input.nextInt();

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getId_arbol() == id) {
				a.get(i).setStock(a.get(i).getStock() - cantidad);
			}
		}
          
	}

	public void comprarFlor() {

		ArrayList<Flores> a;

		Scanner input = new Scanner(System.in);

		System.out.println("Indique id.");
		int id = input.nextInt();
		System.out.println("Indique cantidad.");
		int cantidad = input.nextInt();

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getId_Flor() == id) {
				a.get(i).setStock(a.get(i).getStock() - cantidad);
			}
		}
	}

	public void comprarDeco() {

		ArrayList<Deco> a;

		Scanner input = new Scanner(System.in);

		System.out.println("Indique id.");
		int id = input.nextInt();
		System.out.println("Indique cantidad.");
		int cantidad = input.nextInt();

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getId_Deco() == id) {
				a.get(i).setStock(a.get(i).getStock() - cantidad);
			}
		}

	}
}
