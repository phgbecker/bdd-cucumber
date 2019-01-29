package com.mastercard.app;

public class Calculadora {

	private int firstNumber;
	private int secondNumber;
	private int result;

	public Calculadora(int firstNumber, int secondNumber) {
		this.setFirstNumber(firstNumber);
		this.setSecondNumber(secondNumber);
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void adicao() {
		this.setResult(getFirstNumber() + getSecondNumber());
	}

	public void subtracao() {
		this.setResult(getFirstNumber() - getSecondNumber());
	}

	public void divisao() {
		this.setResult(getFirstNumber() / getSecondNumber());
	}

	public void multiplicacao() {
		this.setResult(getFirstNumber() * getSecondNumber());
	}
}
