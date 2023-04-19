package trabalhoFaculdade;

public final class CalculadoraBitABit {
	
	/* 
	 Soma usando deslocamentos: x + y = 2 * (x&y) + (x^y)
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
	 */
	public static final int subtracao(Integer x, Integer y) {
		
		while (y != 0) {
			int aux = (~x) & y;
			x ^= y;
			y = aux << 1;
		}
		return x;
		
	}

	/*
	 Em resumo, a função multiplica dois inteiros iterando sobre os bits do segundo inteiro "n2",
	  verificando se um bit está definido ou não e, em seguida, adicionando o primeiro inteiro "n1"
	   conforme necessário. As operações de deslocamento para a esquerda e para a direita são usadas
	    para mover para a próxima posição de bit e restaurar o valor original de "n1" após cada iteração.
	 */
	public static final int bitwiseMultiply(int n1, int n2) {
	    int result=0;
	    while (n2 != 0)
	    {
	        if ((n2 & 01) != 0) 
	        {
	            result = result + n1; 
	        }
	        n1 <<= 1;              
	        n1 >>= 1;             
	    }
	    return result;
	}

}
