package br.edu.fatecpg.controleversao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int operacao;
		double N1,N2;
		
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite a opera��o desejada \n 1-Soma \n 2-Suntra��o \n 3-Multiplica��o \n 4-Divis�o");
			operacao = scan.nextInt();
			if(operacao == 5) {
				break;
			}
			System.out.println("Digite o primeiro numero");
			N1 = scan.nextDouble();
			System.out.println("Digite o segundo numero");
			N2 = scan.nextDouble();
			switch(operacao){
			case 1:
				System.out.println("A soma dos valores � de: " + calc.soma(N1, N2));
			case 2:
				System.out.println("A soma dos valores � de: " + calc.sub(N1, N2));
			case 3:
				System.out.println("A soma dos valores � de: " + calc.mult(N1, N2));
			case 4: 
				System.out.println("A soma dos valores � de: " + calc.div(N1, N2));
			}
			}
	
		
	}

}
