package br.edu.fatec.tp;

public class Principal {

	public static void main(String[] args) {		
		System.out.println("Foda-se");
		Carro meuCarro = new Carro();
		Carro carroAlan = new Carro();
		
		meuCarro.marca = "Renault";
		meuCarro.modelo = "Logan";
		meuCarro.placa = "abc-1d34";
		
		System.out.println("Meu carro é da marca: "+meuCarro.marca);
		System.out.println("Meu carro é do modelo: "+meuCarro.modelo);
		System.out.println("A placa do meu carro é: "+meuCarro.placa);
		
		meuCarro.ligar();
		meuCarro.acel(40);
		meuCarro.buzinar();
		meuCarro.frear(50);
		
		
		
		carroAlan.marca = "Fiat";
		carroAlan.modelo = "Idea";
		carroAlan.marca = "LGB-1T23";
		System.out.println("Carro Professor: " + meuCarro.modelo + "\nCarro Aluno: " + carroAlan.modelo);
		
		carroAlan.ligar();
		carroAlan.acel(50);
		carroAlan.acel(30);
		carroAlan.frear(50);
		System.out.println("A velocidade do carro é: "+carroAlan.velAtual);

	}

}
