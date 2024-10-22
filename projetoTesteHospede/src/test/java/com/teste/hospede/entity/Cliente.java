package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Cliente {

	@Test
	private Cliente cliente;

	@BeforeEach
	void setUp() {
		// Arrange
		cliente = new Cliente(1L, "isabely", "56787656", "45678987", "789098799");
	}

	@Test
	@DisplayName("Testando getter e setter do campo id")
	void testId() {
		// Act
		Cliente.setId(2L);
		// Assert
		assertEquals(2L, quarto.getId());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo num")
	void TestNome() {
		// Act
		quarto.setNum("120");
		// Assert
		assertEquals("120", Cliente.getNum());
	}

}
