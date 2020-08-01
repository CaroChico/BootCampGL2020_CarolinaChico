package com.globallogic.bootcampgl.junitTest.ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperacionesTest {
	
	Operaciones op1;
	
	@BeforeEach
	void setUp() {
		op1 = new Operaciones();
	}
	
	@Test
	void test1() {
		int num5 = op1.sumar(1, 2);
		assertEquals(num5, 3);
		assertEquals(num5, 4, "El resultado està mal");
	}
	
	
}
