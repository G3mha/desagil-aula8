package br.edu.insper.desagil.aula8.alfandega;

public class ItemTarifado extends Item {
	private double tarifa;

	public ItemTarifado(String nome, double valor, double rate, double tarifa) {
		super(nome, valor, rate);
		this.tarifa = tarifa;
	}

	public String getNome() {
		return super.getNome();
	}

	public double getValor() {
		return super.getValor();
	}

	public double getRate() {
		return super.getRate();
	}

	public double getTarifa() {
		return this.tarifa;
	}
}
