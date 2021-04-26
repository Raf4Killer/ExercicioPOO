package JUnit;
/**
 * Classe com métodos de cálculo. <br>
 * Representa uma <b> calculadora</b>.
 * 
 * @author rafael
 * @since 2021
 * @version 0.1
 * @see Math.abs
 */
public class calculadora {
	/**
	 * Faz Soma. <br>
	 * Exemplo de uso: {@code CalculadoraTeste.soma(5,3)}
	 * 
	 * @param a Um número a ser somado
	 * @param b Outro número a ser somado
	 * @return a soma de <b>a</b> e <b>b</b>.
	 * 
	 */
	public static double soma(double a, double b) {
		return (a+b);		
	}
	
	/**
	 * Faz Soma Absoluta <br>
	 * Exemplo de uso: {@code CalculadoraTeste.somABS}
	 * @param a Um número a ser somado
	 * @param b Outro número a ser somado
	 * @return a soma de <b> a </b> e <b> b </b>.
	 */
	public static double SomaABS(double a, double b) {
		return (Math.abs(a)+ Math.abs(b));
	}
	
	
	/**
	 * 
	 * @param a Base	 
	 * @param b	Expoente
	 * @return A potêcia de <b> a </b> elevado a <b> b </b>.
	 */
	public static double potencializacao(double a, double b) {
		return (Math.pow(a, b));
	}
}
