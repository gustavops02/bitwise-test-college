package trabalhoFaculdade;

public final class CalculadoraBitABit {
	/* 
 	XOR realiza a soma dos bits correspondentes, ignorando a presença de um eventual 'vai-um'. 
	 */
	public static final int soma(Integer x, Integer y) {
		while (y != 0) {
			int vaiUm = x & y; // Me da o resultado dos bits que precisam de 1.
			x ^= y; 
			y = vaiUm << 1; // passa o bit vai-um para o proximo bit
		}
		return x;
	}
	
	public static final int subtracao(Integer x, Integer y) {
		
		while (y != 0) {
			int aux = (~x) & y; // pega o número emprestado.
			x ^= y; 
			y = aux << 1; // passa o bit emprestado para o proximo bit
		}
		return x;	
	}
	
	public static final int multiplicacao(int n1, int n2) {
	    int result = 0;
	    while (n2 != 0) {
	        if ((n2 & 1) != 0) { // Bit menos significativo	
	            result += n1;
	        }
	        n1 <<= 1; // proximo bit da multiplicacao
	        n2 >>= 1; // processar o proximo bit
	    }
	    return result;
	}
	
    public static int divisao(int num1, int num2) {
        int quociente = 0; // resultado da divisão
        
        while (num1 >= num2) { // enquanto o dividendo for maior ou igual ao divisor
            int desloc = 0;
            while (num1 >= (num2 << desloc)) { // Retorne o maior numero de vezes que o num2 está contido em num1
                desloc++;
            }
            desloc--;
            quociente += (1 << desloc); // adiciona o resultado da divisão parcial ao quociente
            num1 -= (num2 << desloc); // subtrai o resultado da divisão parcial do dividendo
        }
        return quociente;
    }
}