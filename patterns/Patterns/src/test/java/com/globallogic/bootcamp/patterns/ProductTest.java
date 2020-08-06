package com.globallogic.bootcamp.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {
	
	private static final String NAME = "Clavos";

	@Test
	public void testGetNombre() {
		Product product = Product.getNombre(NAME);
		
	}

}
