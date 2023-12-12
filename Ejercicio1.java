package Desafio2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();

        System.out.printf("La cantidad de horas es %d", numero % 24);
        System.out.printf("\nLa cantidad de dias es %d", (numero%168)/24);
        System.out.printf("\nLa cantidad de semanas es %d", (numero / 168));

	}

}

