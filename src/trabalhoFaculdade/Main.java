package trabalhoFaculdade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com uma questão: [1, 2 ou 3]");
		Integer numero = sc.nextInt();

		if (numero > 3 || numero < 1) {
			System.out.print("Escolha somente os numeros possíveis \n");
			sc.close();
		}

		switch (numero) {
		case 1:
			System.out.println("Escolha um número: ");
			Integer num = sc.nextInt();
			PrimeiraQuestao.printResult(num);
			sc.close();
			break;
		case 2:
			System.out.println("Escolha um número para ver se está contido no intervalo (0, 100): ");
			Integer numero01 = sc.nextInt();
			SegundaQuestao.resultado(numero01);
			break;
		case 3:
			break;

		default:
			throw new IllegalArgumentException("Questão não encontrada");
		}

		sc.close();

	}

}
