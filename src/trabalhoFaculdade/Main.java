package trabalhoFaculdade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n2 = 0;
		int n1 = 0;
		System.out.println("Entre com uma questão: [1, 2 ou 3]");
		Integer numero = sc.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Escolha um número: ");
			Integer num = sc.nextInt();
			PrimeiraQuestao.printResult(num);
			sc.close();
			break;
		case 2:
			System.out.println("Escolha um número para ver se está contido no intervalo (1, 100): ");
			Integer numero01 = sc.nextInt();
			SegundaQuestao.resultado(numero01);
			break;
		case 3:
			System.out.println("Qual operação deseja fazer? [soma, sub, mult, div]: ");
			String resp = sc.next();
			switch (resp) {
			case "soma":
				System.out.println("Escolha dois números para fazer a soma: ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				int soma = CalculadoraBitABit.soma(n1, n2);
				System.out.println("A soma é: " + soma);
				break;
			case "sub":
				System.out.println("Escolha dois números para fazer a subtração: ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				int sub = CalculadoraBitABit.subtracao(n1, n2);
				System.out.println("A soma é: " + sub);
				break;
			case "mult":
				System.out.println("Escolha dois números para fazer a multiplicação: ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				int mult = CalculadoraBitABit.multiplicacao(n1, n2);
				System.out.println("A multiplicação é: " + mult);
				break;
			case "div":
				System.out.println("Escolha dois número para fazer a divisão: ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				int quociente = CalculadoraBitABit.divisao(n1, n2);
				System.out.println("O resultado da divisão é: " + quociente);
				break;
			default:
				System.err.println("Operação não encontrada");
				sc.close();
			}
		default:
			sc.close();

		}

	}
}
