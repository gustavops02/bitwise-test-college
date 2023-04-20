package trabalhoFaculdade;

public class SegundaQuestao {

	private static final int[] range = { 1, 100 };

	public static void resultado(Integer numero) {

		if (numero >= range[0] && numero <= range[1]) {
			System.out.println("O numero " + numero + " está entre o intervalo de 1 a 100.");
			
		} else {
			System.out.println("O numero " + numero + " não está entre o intervalo de 1 a 100.");
		}
	}
}
