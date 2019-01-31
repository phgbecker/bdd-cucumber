package com.mastercard.steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.mastercard.app.Calculadora;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CalculadoraSteps {

	private Calculadora calculadora;

	@Dado("que eu ligue a calculadora.")
	public void que_eu_ligue_a_calculadora() {
		calculadora = new Calculadora();
	}

	@Quando("adiciono o {int} e o {int}")
	public void adiciono_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora.adicao(firstNumber, secondNumber);
	}

	@Quando("subtraio o {int} e o {int}")
	public void subtraio_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora.subtracao(firstNumber, secondNumber);
	}

	@Quando("divido o {int} e o {int}")
	public void divido_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora.divisao(firstNumber, secondNumber);
	}

	@Quando("multiplico o {int} e o {int}")
	public void multiplico_o_e_o(Integer firstNumber, Integer secondNumber) {
		calculadora.multiplicacao(firstNumber, secondNumber);
	}

	@Então("o resultado é {int}")
	public void o_resultado_é(Integer result) {
		assertThat(result, is(equalTo(calculadora.getResult())));
	}

}
