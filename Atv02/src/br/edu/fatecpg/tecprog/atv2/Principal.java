package br.edu.fatecpg.tecprog.atv2;
import java.util.Scanner;

public class Principal {
	
	public static void preencherMatriz(double M[][]) {
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0;i<M.length;i++) {
			for(int j = 0;j<M.length;j++) {
					System.out.println("Digite um número: ");
					M[i][j] = ler.nextDouble();
				}
			}

	}
	public static double[][] somaMatriz(double M1[][],double M2[][]) {
		double[][] somaM = new double [3][3];
		for(int i = 0;i<somaM.length;i++) {
			for(int j = 0;j<somaM.length;j++) {
				somaM[i][j] = M1[i][j]+M2[i][j];
			}
		}
		return somaM;
	}
	public static void imprimeMatriz(double M[][]) {
		for(int i = 0;i<M.length;i++) {
			for(int j=0;j<M.length;j++) {
				if(j==0) {
					System.out.print("[" + M[i][j] + "] ");
				}else if(j==1) {
					System.out.print("[" + M[i][j] + "] ");
				}else {
					System.out.print("[" + M[i][j] + "] ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void preencherMatrizString(String M[][]) {
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0;i<M.length;i++) {
			for(int j = 0;j<M.length;j++) {
				if(j == 0) {
					System.out.println("Digite seu login: ");
					M[i][j] = ler.nextLine();
				}
				else if(j == 1){
					System.out.println("Digite sua senha: ");
					M[i][j] = ler.nextLine();
				}
			}
		}

	}
	public static boolean verificaMatriz(String M[][],String digitado[][]) {
		boolean verifica = false;
		for(int i = 0;i<M.length;i++) {
			for(int j = 0;j<M.length;j++) {
					if(M[i][0].equals(digitado[0][0]) && M[i][1].equals(digitado[0][1])) {
						verifica = true;
				}
			}
		}
		return verifica;	
	}
	public static void preencherMatrizStringGenerica(String M[][]) {
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0;i<M.length;i++) {
			for(int j = 0;j<M.length;j++) {
					System.out.println("Digite o seu dado: ");
					M[i][j] = ler.nextLine();
				}
			}
		}
	public static String[][] transposicaoMatriz(String M[][]) {
		String[][] tranposta = new String[M.length][M.length];
		for(int i = 0;i<M.length;i++) {
			for(int j = 0;j<M.length;j++) {
				tranposta[i][j] = M[j][i];
			}
		}
		return tranposta;
	}

	public static void imprimeMatrizString(String M[][]) {
		for(int i = 0;i<M.length;i++) {
			for(int j=0;j<M.length;j++) {
				System.out.print(M[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int valor;
	    Scanner ler = new Scanner(System.in);
	    String menu = """ 
	            ***************************
	            Entre com uma das opções:
	            1 - Exercicio 1;
	            2 - Exercicio 2;
	            3 - Exercicio 3;
	            ***************************
	            """;
	    System.out.println(menu);
	    valor = ler.nextInt();
		
		switch(valor) {
		//EXERCICIO 1
		case 1:
			double[][] A = new double[3][3],B = new double[3][3];
			double[][] resultado = new double[3][3];
			preencherMatriz(A);
			preencherMatriz(B);
			resultado = somaMatriz(A,B);
			imprimeMatriz(resultado);
			break;
		case 2:
			//EXERCICIO 2
			String[][] login = new String[6][2],dadoUsuario = new String[1][2];
			boolean verifica = false;
			preencherMatrizString(login);
			System.out.println("Digite o login de entrada: ");
			dadoUsuario[0][0] = ler.nextLine();
			System.out.println("\n");
			System.out.println("Digite a senha de entrada: ");
			dadoUsuario[0][1] = ler.nextLine();
			verifica = verificaMatriz(login,dadoUsuario);
			if(verifica) {
				System.out.println("Login aprovado");
			}else {
				System.out.println("Login negado");
			}
			break;
		case 3:
			//EXERCICIO 3
			int tamL,tamC;
			System.out.println("Digite o número de linhas");
			tamL = ler.nextInt();
			System.out.println("Digite o número de colunas");
			tamC = ler.nextInt();
			String[][] dados = new String[tamL][tamC];
			String[][] dadosTranspostos = new String[tamL][tamC];
			preencherMatrizStringGenerica(dados);
			dadosTranspostos = transposicaoMatriz(dados);
			imprimeMatrizString(dadosTranspostos);
			break;
		default:
			System.out.println("Favor digitar uma opção valida");
			break;
			}
		ler.close();
		}
	}

