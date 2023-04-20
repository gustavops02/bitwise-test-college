package trabalhoFaculdade;

public final class CalculadoraBitABit {
	
	/* 
 Soma usando deslocamentos: x + y = 2 * (x&y) + (x^y)
 A cada iteração do loop, a variável "aux" é calculada como o 
 resultado da operação AND entre os bits correspondentes de x e y.
 Essa operação tem como objetivo identificar os bits que precisam ser somados com o próximo dígito.
 
 XOR realiza a soma dos bits correspondentes, ignorando a presença de um eventual 'vai-um'. 
	 */
	public static final int soma(Integer x, Integer y) {
		while (y != 0) {
			int aux = x & y;
			x ^= y; 
			y = aux << 1;
		}
		return x;
	}
	
	/* 
	 Subtração usando deslocamentos: x - y = 2 * (!x & y) + (x^y)
	 A operação XOR é particularmente útil porque permite calcular a diferença
	 entre os bits sem levar em conta a presença de um possível bit de empréstimo.
	 */
	public static final int subtracao(Integer x, Integer y) {
		
		while (y != 0) {
			int aux = (~x) & y; // pega o número emprestado.
			x ^= y; 
			y = aux << 1; // passa o bit emprestado para o proximo bit
		}
		return x;
		
	}

	public static final int bitwiseMultiply(int n1, int n2) {
	    int result = 0;
	    while (n2 != 0) {
	        if ((n2 & 1) != 0) { // se é impar ou não. 
	            result += n1;
	        }
	        n1 <<= 1; // proximo bit da multiplicacao
	        n2 >>= 1; // processar o proximo bit
	    }
	    return result;
	}

}
