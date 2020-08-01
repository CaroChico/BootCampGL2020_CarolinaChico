package com.globallogic.bootcampgl.junitTest.ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ejercicio17Test {

	Ejercicio17 e1;

	@BeforeEach
	void setUp() {
		e1 = new Ejercicio17();
	}

	@Test
	void test1() {
		assertTrue(e1.iterar(2), "Este valor no es true.");

	}

	@Test
	void test2() {

		assertFalse(e1.iterar(4), "Este valor no es false.");
	}

}
