package br.edu.insper.desagil.aula8.alfandega;

public class ItemTarifado {
	private String nome;
	private double valor;
	private double rate;
	private double tarifa;

	public ItemTarifado(String nome, double valor, double rate, double tarifa) {
		this.nome = nome;
		this.valor = valor;
		this.rate = rate;
		this.tarifa = tarifa;
	}

	public String getNome() {
		return this.nome;
	}

	public double getValor() {
		return this.valor;
	}

	public double getRate() {
		return this.rate;
	}

	public double getTarifa() {
		return this.tarifa;
	}
}
