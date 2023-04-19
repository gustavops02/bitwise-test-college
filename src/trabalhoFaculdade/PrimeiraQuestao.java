package trabalhoFaculdade;

public class PrimeiraQuestao {
	
	private static String isParOuImpar(Integer number) {
		return number % 2 == 0 ? "par" : "impar";
	}

	private static String isPositivoOuNegativo(Integer number) {
		return number < 0 ? "negativo" : "positivo";
	}

	public static void printResult(Integer number) {
		System.out.println("O numero é " + isParOuImpar(number) + " e " + isPositivoOuNegativo(number));
	}
}
