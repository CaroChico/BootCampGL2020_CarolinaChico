package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() {
		assertEquals("Test", "Test");
	}

	@Test
	void test2( ) {
		String s1 = "Pedro";
		String s2 = "Pedro";
		String s3 = "Valentina";
		
		assertEquals(s1, s2);
		assertNotEquals(s1, s3);
	}
	
	@Test
	void test3() {
		assertTrue(25 > 12);
		assertFalse(25 > 27);
		
				
	}
	
	@Test
	void test4() {
		
		Long l1 = null;
		assertNull(l1);
		
		l1 = (long) 1;
		assertNotNull(l1);
		
	}
	
}
