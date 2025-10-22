package tema2_eclipse;

public class HelloEclipse {

	public static void main(String[] args) {

		System.out.println("¡Mi primer programa!");

		
		System.out.println("Reglas básicas de Java:");
		System.out.println("1) Distingue MAYÚSCULAS y minúsculas");
		System.out.println("2) Cada instrucción termina con ;");

		
		// Comentario de una línea: Este programa imprime mensajes en consola

		/* Comentario de varias líneas:
		   Autor: Daniel Vázquez Arce
		   Fecha: 07/10/2025
		 */


		int contadorMensajes = 0;
		contadorMensajes++;
		System.out.println("Mensajes impresos: " + contadorMensajes);

		
		int x = 3;
		System.out.print("Este código no está");
		System.out.print(" muy bien ");
		System.out.print("tabulado");
		x = 7;
		System.out.println();
	}

}
