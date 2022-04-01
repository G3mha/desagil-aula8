package br.edu.insper.desagil.aula8.past;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora c;

	@BeforeEach
	private void setUp() {
		c = new Calculadora();
	}

	@Test
	void soma0e0() {
		assertEquals(0.0, c.executa(0, 0, '+'), 0.000001);
	}

	@Test
	void soma0e1() {
		assertEquals(1.0, c.executa(0, 1, '+'), 0.000001);
	}

	@Test
	void soma0e2() {
		assertEquals(2.0, c.executa(0, 2, '+'), 0.000001);
	}

	@Test
	void soma1e0() {
		assertEquals(1.0, c.executa(1, 0, '+'), 0.000001);
	}

	@Test
	void soma1e1() {
		assertEquals(2.0, c.executa(1, 1, '+'), 0.000001);
	}

	@Test
	void soma1e2() {
		assertEquals(3.0, c.executa(1, 2, '+'), 0.000001);
	}

	@Test
	void soma2e0() {
		assertEquals(2.0, c.executa(2, 0, '+'), 0.000001);
	}

	@Test
	void soma2e1() {
		assertEquals(3.0, c.executa(2, 1, '+'), 0.000001);
	}

	@Test
	void soma2e2() {
		assertEquals(4.0, c.executa(2, 2, '+'), 0.000001);
	}

	@Test
	void subtrai0e0() {
		assertEquals(0.0, c.executa(0, 0, '-'), 0.000001);
	}

	@Test
	void subtrai0e1() {
		assertEquals(-1.0, c.executa(0, 1, '-'), 0.000001);
	}

	@Test
	void subtrai0e2() {
		assertEquals(-2.0, c.executa(0, 2, '-'), 0.000001);
	}

	@Test
	void subtrai1e0() {
		assertEquals(1.0, c.executa(1, 0, '-'), 0.000001);
	}

	@Test
	void subtrai1e1() {
		assertEquals(0.0, c.executa(1, 1, '-'), 0.000001);
	}

	@Test
	void subtrai1e2() {
		assertEquals(-1.0, c.executa(1, 2, '-'), 0.000001);
	}

	@Test
	void subtrai2e0() {
		assertEquals(2.0, c.executa(2, 0, '-'), 0.000001);
	}

	@Test
	void subtrai2e1() {
		assertEquals(1.0, c.executa(2, 1, '-'), 0.000001);
	}

	@Test
	void subtrai2e2() {
		assertEquals(0.0, c.executa(2, 2, '-'), 0.000001);
	}

	@Test
	void multiplica0e0() {
		assertEquals(0.0, c.executa(0, 0, '*'), 0.000001);
	}

	@Test
	void multiplica0e1() {
		assertEquals(0.0, c.executa(0, 1, '*'), 0.000001);
	}

	@Test
	void multiplica0e2() {
		assertEquals(0.0, c.executa(0, 2, '*'), 0.000001);
	}

	@Test
	void multiplica1e0() {
		assertEquals(0.0, c.executa(1, 0, '*'), 0.000001);
	}

	@Test
	void multiplica1e1() {
		assertEquals(1.0, c.executa(1, 1, '*'), 0.000001);
	}

	@Test
	void multiplica1e2() {
		assertEquals(2.0, c.executa(1, 2, '*'), 0.000001);
	}

	@Test
	void multiplica2e0() {
		assertEquals(0.0, c.executa(2, 0, '*'), 0.000001);
	}

	@Test
	void multiplica2e1() {
		assertEquals(2.0, c.executa(2, 1, '*'), 0.000001);
	}

	@Test
	void multiplica2e2() {
		assertEquals(4.0, c.executa(2, 2, '*'), 0.000001);
	}

	@Test
	void divide0e0() {
		assertEquals(0.0, c.executa(0, 0, '/'), 0.000001);
	}

	@Test
	void divide0e1() {
		assertEquals(0.0, c.executa(0, 1, '/'), 0.000001);
	}

	@Test
	void divide0e2() {
		assertEquals(0.0, c.executa(0, 2, '/'), 0.000001);
	}

	@Test
	void divide1e0() {
		assertEquals(0.0, c.executa(1, 0, '/'), 0.000001);
	}

	@Test
	void divide1e1() {
		assertEquals(1.0, c.executa(1, 1, '/'), 0.000001);
	}

	@Test
	void divide1e2() {
		assertEquals(0.5, c.executa(1, 2, '/'), 0.000001);
	}

	@Test
	void divide2e0() {
		assertEquals(0.0, c.executa(2, 0, '/'), 0.000001);
	}

	@Test
	void divide2e1() {
		assertEquals(2.0, c.executa(2, 1, '/'), 0.000001);
	}

	@Test
	void divide2e2() {
		assertEquals(1.0, c.executa(2, 2, '/'), 0.000001);
	}

	@Test
	void arroba0e0() {
		assertEquals(0.0, c.executa(0, 0, '@'), 0.000001);
	}

	@Test
	void arroba0e1() {
		assertEquals(0.0, c.executa(0, 1, '@'), 0.000001);
	}

	@Test
	void arroba0e2() {
		assertEquals(0.0, c.executa(0, 2, '@'), 0.000001);
	}

	@Test
	void arroba1e0() {
		assertEquals(0.0, c.executa(1, 0, '@'), 0.000001);
	}

	@Test
	void arroba1e1() {
		assertEquals(0.0, c.executa(1, 1, '@'), 0.000001);
	}

	@Test
	void arroba1e2() {
		assertEquals(0.0, c.executa(1, 2, '@'), 0.000001);
	}

	@Test
	void arroba2e0() {
		assertEquals(0.0, c.executa(2, 0, '@'), 0.000001);
	}

	@Test
	void arroba2e1() {
		assertEquals(0.0, c.executa(2, 1, '@'), 0.000001);
	}

	@Test
	void arroba2e2() {
		assertEquals(0.0, c.executa(2, 2, '@'), 0.000001);
	}
}
