package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void soma() {
	 final double resultado_esperado = 20;
	 final double resultado = calculadora.soma(10,10);
	 Assert.assertEquals(resultado_esperado, resultado, 0);
	}
	
	@Test
	void somABS(){
	 final double resultado_esperado = 20;
	 final double resultado = calculadora.SomaABS(10,10);
	 Assert.assertEquals(resultado_esperado, resultado, 0);
	}
	
	@Test
	void Potenciacao(){
	 final double resultado_esperado = 9;
	 final double resultado = calculadora.potencializacao(3,2);
	 Assert.assertEquals(resultado_esperado, resultado, 0);
	}
	
}
