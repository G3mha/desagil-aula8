package br.edu.insper.desagil.aula8.past;

import java.util.List;

public class Variancia {

	public double calcula(List<Integer> numeros) {
		double s;

		s = 0.0;
		for (int n : numeros) {
			s += n;
		}
		double m = s / numeros.size();

		s = 0.0;
		for (int n : numeros) {
			double d = n - m;
			s += d * d;
		}
		return s / numeros.size();
	}

}
