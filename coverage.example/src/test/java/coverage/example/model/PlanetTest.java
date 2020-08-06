package coverage.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlanetTest {

	private static final String URANO = "Urano";
	private static final String MARTE = "Marte";
	private static final String VENUS = "Venus";

	Planet planeta;
	String name = "Urano";

	@BeforeEach
	void setUp() throws Exception {

		planeta = new Planet();

	}

	@Test
	void testToString() {

		planeta.setName(VENUS);
		String nombre = planeta.toString();

		assertEquals("Planet [name=" + VENUS + "]", nombre);

	}

	@Test
	void testGetName() {
		planeta.name = name;

		assertEquals(URANO, planeta.getName());
	}

	@Test
	void testSetName() {
		planeta.setName(MARTE);

		assertEquals(MARTE, planeta.getName());
	}

}
