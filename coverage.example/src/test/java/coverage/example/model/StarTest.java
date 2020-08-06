package coverage.example.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StarTest {

	private static final String BNM = "BNM";
	private static final String COLOR = "Azul";
	private static final String PLANETA = "Tierra";

	Star estrella;
	String name = "BNM";
	String color = "Azul";

	@BeforeEach
	void setUp() throws Exception {

		estrella = new Star();

	}

	@Test
	void testGetName() {
		estrella.setName(name);

		assertEquals(BNM, estrella.getName());
	}

	@Test
	void testSetName() {
		estrella.setName(name);

		assertEquals(BNM, estrella.getName());
	}

	@Test
	void testGetColor() {

		color = estrella.getColor();

		assertNull(color);
	}

	@Test
	void testGetPlanets() {
		Planet planeta = new Planet();
		planeta.setName(PLANETA);
		
		List<Planet> planets = new ArrayList<Planet>();
		planets.add(planeta);
		
		estrella.setPlanets(planets);
		
		assertEquals(planets, estrella.getPlanets());
	}

	@Test
	void testSetPlanets() {
		Planet planeta = new Planet();
		planeta.setName(PLANETA);
		
		List<Planet> planets = new ArrayList<Planet>();
		planets.add(planeta);
		
		estrella.setPlanets(planets);
		
		assertEquals(planets, estrella.getPlanets());
	}

	@Test
	void testToString() {
		estrella.setName(BNM);
		
		Planet planeta = new Planet();
		planeta.setName(PLANETA);
		
		List<Planet> planets = new ArrayList<Planet>();
		planets.add(planeta);
		
		estrella.setPlanets(planets);
		
		String nombre = estrella.toString();
		
		assertEquals("Star [name=" + BNM + ", planets=" + planets + "]", nombre);
	}

}
