package br.edu.fatecpg.controleversao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int operacao;
		double N1,N2;
		
		Porcentagem porcento = new Porcentagem();
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite a operação desejada \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-Sair");
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
				System.out.println("A soma dos valores é de: " + calc.soma(N1, N2));
				break;
			case 2:
				System.out.println("A subtração dos valores é de: " + calc.sub(N1, N2));
				break;
			case 3:
				System.out.println("A multiplicação dos valores é de: " + calc.mult(N1, N2));
				break;
			case 4: 
				System.out.println("A divisão dos valores é de: " + calc.div(N1, N2));
				break;
			}
			
		}
		System.out.println(porcento.regraDeTres(100,100,20));
		
	}

}
