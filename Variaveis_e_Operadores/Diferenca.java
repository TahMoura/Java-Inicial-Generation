package Variaveis_e_Operadores;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		float num1, num2, num3, num4, diferenca;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cálculo de Diferença\n****************************");
		
		System.out.print("Digite o Primeiro Valor: ");
		num1 = scan.nextFloat();
		
		System.out.print("Digite o Segundo Valoe: ");
		num2 = scan.nextFloat();
		
		System.out.print("Digite o Terceiro Valor: ");
		num3 = scan.nextFloat();
		
		System.out.print("Digite o Quarto valor: ");
		num4 = scan.nextFloat();
		
		diferenca = (num1 * num2) - (num3 * num4);
		
		System.out.printf("A difernça entre os valores é: %.2f", diferenca);
	}

}
