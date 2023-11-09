package Variaveis_e_Operadores;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao Programa de Cálculo de Média!\n*******************");
		
		System.out.print("Por favor, digite a primeira nota: ");
		nota1 = scan.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = scan.nextFloat();
		
		System.out.print("Agora, a terceira nota: ");
		nota3 = scan.nextFloat();
		
		System.out.print("Por fim, digite a quarta nota: ");
		nota4 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Sua Média Final é: %.2f", media);
		
		

	}

}
