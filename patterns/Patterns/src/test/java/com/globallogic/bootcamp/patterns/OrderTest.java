package com.globallogic.bootcamp.patterns;

import static org.junit.Assert.*;

import java.util.Currency;

import org.junit.Test;

public class OrderTest {
	private static final String NAME = "Pesos Argentinos";

	@Test
	public void testOrder() {
		Order o1 = new Order();
		Order o2 = new Order();

		assertEquals(o1.getCurrency(), o2.getCurrency());

	}

}
