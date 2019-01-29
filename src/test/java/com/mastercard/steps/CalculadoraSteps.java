package com.mastercard.steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.mastercard.app.Calculadora;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CalculadoraSteps {

	private Calculadora calculadora;
	
	@Quando("adiciono o {int} e o {int}")
	public void adiciono_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora = new Calculadora(firstNumber, secondNumber);
		calculadora.adicao();
	}

	@Então("o resultado é {int}")
	public void o_resultado_é(Integer result) {
		assertThat(result, is(equalTo(calculadora.getResult())));
	}

	@Quando("subtraio o {int} e o {int}")
	public void subtraio_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora = new Calculadora(firstNumber, secondNumber);
		calculadora.subtracao();
	}

	@Quando("divido o {int} e o {int}")
	public void divido_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora = new Calculadora(firstNumber, secondNumber);
		calculadora.divisao();
	}

	@Quando("multiplico o {int} e o {int}")
	public void multiplico_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora = new Calculadora(firstNumber, secondNumber);
		calculadora.multiplicacao();
	}
}
