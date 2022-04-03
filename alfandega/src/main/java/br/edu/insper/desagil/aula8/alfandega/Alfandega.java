package br.edu.insper.desagil.aula8.alfandega;

import java.util.ArrayList;
import java.util.List;

public class Alfandega {
	private static final double TARIFA_MIN = 0.01;
	private List<Item> itens;
	private List<ItemTarifado> itensTarifados;

	public Alfandega() {
		this.itens = new ArrayList<>();
		this.itensTarifados = new ArrayList<>();
	}

	public void declara(Item item) {
		this.itens.add(item);
	}

	public void declara(ItemTarifado itemTarifado) {
		this.itensTarifados.add(itemTarifado);
	}

	public double getTotalDeclarado() {
		double total = 0.0;
		for (Item item : this.itens) {
			total += item.getRate() * item.getValor();
		}
		for (ItemTarifado itemTarifado : this.itensTarifados) {
			total += itemTarifado.getRate() * itemTarifado.getValor();
		}
		return total;
	}

	public double getTotalDevido() {
		double total = 0.0;
		for (Item item : this.itens) {
			// Mesmo em itens sem tarifa, a alfândega cobra
			// uma taxa de 1% Por quê? Porque eles podem.
			total += item.getRate() * item.getValor() * TARIFA_MIN;
		}
		for (ItemTarifado itemTarifado : this.itensTarifados) {
			total += itemTarifado.getRate() * itemTarifado.getValor() * itemTarifado.getTarifa();
		}
		return total;
	}
}
