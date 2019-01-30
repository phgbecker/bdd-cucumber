package com.mastercard.app;

public class Calculadora {

	private int result;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void adicao(int firstNumber, int secondNumber) {
		this.setResult(firstNumber + secondNumber);
	}

	public void subtracao(int firstNumber, int secondNumber) {
		this.setResult(firstNumber - secondNumber);
	}

	public void divisao(int firstNumber, int secondNumber) {
		this.setResult(firstNumber / secondNumber);
	}

	public void multiplicacao(int firstNumber, int secondNumber) {
		this.setResult(firstNumber * secondNumber);
	}
}
