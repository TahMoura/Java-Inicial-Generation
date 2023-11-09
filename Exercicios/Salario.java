package Exercicios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá! Seja bem Vindo!\nPrograma para Calcular Abono Salarial\n****************************");
		
		System.out.print("Por favor, digite o valor do Salário: ");
		salario = scan.nextFloat();
		
		System.out.print("Agora, digite o valor do Abono: ");
		abono = scan.nextFloat();
		
		novoSalario = salario+abono;
		
		System.out.printf("\nSeu novo Salário é: %.2f", novoSalario);
		System.out.println("\nFinalizando...");
		
	}

}
