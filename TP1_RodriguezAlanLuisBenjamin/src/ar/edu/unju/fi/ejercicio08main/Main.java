package ar.edu.unju.fi.ejercicio08main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		System.out.println("CALCULADORA\n");
		System.out.println("Ingrese un numero: ");
		n = scanner.nextInt();
		calculadora.setN(n);
		
		System.out.println("La sumatoria del numero es: " + calculadora.CalcularSumatoria() + "\n");
		System.out.println("La productoria del numero es: " + calculadora.CalcularProductoria() + "\n");
		
		scanner.close();

	}

}
