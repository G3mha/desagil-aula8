package br.edu.insper.desagil.aula8.past;

public class Calculadora {

	public double executa(int a, int b, char op) {
		if (op == '+') {
			return a + b;
		}
		if (op == '-') {
			return a - b;
		}
		if (op == '*') {
			return a * b;
		}
		if (op == '/') {
			if (b == 0) {
				return 0.0;
			}
			return (double) a / b;
		}
		return 0.0;
	}

}
