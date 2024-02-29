package br.edu.fatecpg.tecprog.atv1;

import java.util.Scanner;

public class Principal {
	
	public static void exerc1() {
		double num;
		Scanner ler1 = new Scanner(System.in);
		System.out.println("Digite um número");
		num = ler1.nextDouble();
		ler1.close();
		if(num >= 0) {
			System.out.println("Seu número é positivo");
		}
		else {
			System.out.println("Seu número é negativo");
		}
	}
	public static void exerc2() {
		Scanner ler = new Scanner(System.in);
		double num1,num2;
		System.out.println("Digite o primeiro numero");
		num1 = ler.nextDouble();
		System.out.println("Digite o segundo numero");
		num2 = ler.nextDouble();
		ler.close();
		if(num1 == num2){
			System.out.println("Os números são iguais");
		}
		else if(num1 > num2) {
			System.out.println("O número 1 é maior que o número 2");
		}
		else {
			System.out.println("O número 2 é maior que o número 1");
		}
			
	}
	public static void exerc3() {
		int valor;
		double areaQ,areaC;
	    Scanner ler = new Scanner(System.in);
	    String menu = """ 
	            ***************************
	            Entre com uma das opções:
	            1 - Calcular area do quadrado;
	            2 - Calcular area do circulo;
	    		""";
	    System.out.println(menu);
	    valor = ler.nextInt();
	    switch(valor) {
	    case 1:
			System.out.println("Digite o tamanho do lado do quadrado");
			areaQ = ler.nextDouble();
			System.out.println("O valor da area do quadrado é: " + areaQ*areaQ);
			break;
	    case 2:
			System.out.println("Digite o raio do circulo");
			areaC = ler.nextDouble();
			System.out.println("O valor da area do quadrado é: " + areaC*areaC*(3.14));
	    }
	    ler.close();
	}
	public static void exerc4() {
		Scanner ler = new Scanner(System.in);
		double val;
		System.out.println("Digite o número desejado");
		val = ler.nextDouble();
		for(int i = 0;i <= 10;i++) {
			System.out.println(i + " X " + val + " = " + i*val);
		}
		ler.close();
	}
	public static void exerc5() {
		int valor;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		valor = ler.nextInt();
		if(valor % 2 == 0) {
			System.out.println("Seu número é par");
		}else {
			System.out.println("Seu número é impar");
		}
		ler.close();
	}
	public static void exerc6() {
		Scanner ler = new Scanner(System.in);
		int valor,fat;
		System.out.println("Digite um número inteiro");
		valor = ler.nextInt();
		fat = valor;
		if(valor > 0 && valor <= 1) {
			System.out.println("O Fatorial é: " + valor);
		}else if(valor < 0) {
			System.out.println("Número negativo não é permitido");
		}else {
			while(valor > 1) {
				fat = fat*(valor-1);
				valor--;
			}
			System.out.println("O Fatorial é: " + fat);
		}
		ler.close();
	}
	public static void exerc7() {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade");
		idade = ler.nextInt();
		if(idade >= 18) {
			System.out.println("Você é um adulto");
		}else if(idade > 60) {
			System.out.println("Você é um(a) idoso(a)");
		}else {
			System.out.println("Você é menor de idade");
		}
		ler.close();
	}
	public static void exerc8() {
		Scanner ler = new Scanner(System.in);
		int num, resultado = 1,numImpar = 1;
		System.out.println("Digite a quantidade de números impares desejados");
		num = ler.nextInt();
		if(num == 1) {
		   System.out.println("A soma desses números é: " + resultado);
		}else {
		while(num > 1) {
			numImpar = numImpar+2;
			resultado = resultado+numImpar;			
			num--;
		}
		System.out.println("A soma desses números é: " + resultado);
		}
		ler.close();
	}
	public static void exerc9() {
		Scanner ler = new Scanner(System.in);
		String[] listNomes = new String[5];
		String nomeBusca;
		boolean busca = false;
		for(int i = 0;i < 5;i++) {
			System.out.println("Digite o " + (i+1) + "º nome");
			listNomes[i] = ler.nextLine();
		}
		System.out.println("Digite um nome para ser buscado");
		nomeBusca = ler.nextLine();
		System.out.println("Nome a ser buscado " + nomeBusca);
		for(int i = 0;i < 5;i++) {
			if(listNomes[i].contains(nomeBusca)){
				busca = true;
				break;
			}
		}
		if(busca == true){
			System.out.println("Nome encontrado");
		}
		else {
			System.out.println("Nome NÃO encontrado");
		}
		ler.close();
	}
	public static void exerc10() {
		Scanner ler = new Scanner(System.in);
		String senhaC = "123Java",senhaD = null;
		boolean verificar = false;
		System.out.println("Digite a senha");
		senhaD = ler.nextLine();
		if(senhaD.equals(senhaC)) {
			verificar = true;
		}else {
			while(verificar == false) {
				System.out.println("Digite a senha");
				senhaD = ler.nextLine();
				if(senhaD.equals(senhaC)) {
					verificar = true;
					break;
				}
			}
			System.out.println("Acesso liberado");
		}
		ler.close();
	}
	
	public static void main(String[] args) {
	int valor;
    Scanner ler = new Scanner(System.in);
    String menu = """ 
            ***************************
            Entre com uma das opções:
            1 - Exercicio 1;
            2 - Exercicio 2;
            3 - Exercicio 3;
            4 - Exercicio 4;
            5 - Exercicio 5;
            6 - Exercicio 6;
            7 - Exercicio 7;
            8 - Exercicio 8;
            9 - Exercicio 9;
            10 - Exercicio 10;
            ***************************
            """;
    System.out.println(menu);
    valor = ler.nextInt();
    
    switch(valor) {
    case 1:
    	exerc1();
    break;
    case 2:
       exerc2();
    break;
    case 3:
    	exerc3();
    break;
    case 4:
        exerc4();
    break;
    case 5:
    	exerc5();
    	break;
    case 6:
    	exerc6();
    	break;
    case 7:
    	exerc7();
    	break;
    case 8:
    	exerc8();
    	break;
    case 9:
    	exerc9();
    	break;
    case 10:
    	exerc10();
    	break;
    default:
        System.out.println("Valor não corresponde as opções");
    break;
    }
    ler.close();
}
}
