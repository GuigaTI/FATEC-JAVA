package br.edu.fatec.tp;

public class Carro {
	public String marca;
	public String modelo;
	public String placa;
	public double velMax = 180;
	public double velAtual = 0;
	public boolean ligado = false;
	
	//ligar, acel,frar, buzinar
	
	public void ligar() {
		if(this.ligado == true) {
			System.out.println("Carro sendo desligado");
			this.ligado = false;
		}else if(this.ligado == false) {
			System.out.println("Carro sendo ligado");
			this.ligado = true;
		}
		
	}
	
	public void acel(double acelaracao) {
		if(this.ligado) {
			if(this.velAtual < this.velMax) {
				this.velAtual += acelaracao;
				if(this.velAtual >= 180) {
				this.velAtual = 180;
				System.out.println("Velocidade maxima atingida");
				}
			}else {
				System.out.println("Velocidade maxima atingida");
			}
		}else if(this.ligado == false) {
			System.out.println("Ligar o carro primeiro");
		}
	}
	
	public void frear(double vel) {
		if(this.ligado) {
			if(this.velAtual >= 0) {
				this.velAtual -= vel;
			if(this.velAtual < 0) {
				this.velAtual = 0;
				System.out.println("Velocidade do carro já esta no minimo");
			}
		}else if(this.ligado == false) {
			System.out.println("Ligar o carro primeiro");
		}
	}
}
	
	public void buzinar() {
		if(this.ligado) {
			System.out.println("BEHHHHHHHHHHHHHHHHHHHH");
		}else if(this.ligado == false) {
			System.out.println("Ligar o carro primeiro");
		}
		
	}
	
	
}
