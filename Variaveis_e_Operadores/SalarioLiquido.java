package Variaveis_e_Operadores;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo! Vamos calcular o seu Salário Líquido!\n********************");
		
		System.out.print("Qual o valor do Salário Bruto? ");
		salarioBruto = scan.nextFloat();
		
		System.out.print("Qual o valor total do Adicional Noturno? ");
		adicionalNoturno = scan.nextFloat();
		
		System.out.print("Qual o valor total de Horas Extras? ");
		horasExtras = scan.nextFloat();
		
		System.out.print("Agora, qual o valor total de Descontos? ");
		descontos = scan.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO valor total Líquido do seu Salário é: %.2f", salarioLiquido);
	}

}
