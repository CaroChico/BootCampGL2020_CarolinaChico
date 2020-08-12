package hibernate.example.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MenuTest {
	private static final String NOMBRE = "Milanesa Clasica";
	private static final String DESCRIPCION = "una delicada milanesa con crocantes papas fritas finamente seleccionadas";
	private static final int PRECIO = 500;

	Menu m1;

	
	@BeforeEach
	void setUp() {
		m1 = new Menu();
	}

	@Test
	void testMenuStringStringInt() {
	}

	@Test
	void testGetNombre() {

		m1.setNombre(NOMBRE);

		assertEquals(NOMBRE, m1.getNombre());

	}

	@Test
	void testSetNombre() {

		m1.setNombre(NOMBRE);
		
		assertEquals(NOMBRE, m1.getNombre());

	}

	@Test
	void testGetDescripcion() {
		m1.setDescripcion(DESCRIPCION);
		
		assertEquals(DESCRIPCION, m1.getDescripcion());
	}

	@Test
	void testSetDescripcion() {
		m1.setDescripcion(DESCRIPCION);
		
		assertEquals(DESCRIPCION, m1.getDescripcion());
	}

	@Test
	void testGetPrecio() {

		m1.setPrecio(PRECIO);

		assertEquals(PRECIO, m1.getPrecio());

	}

	@Test
	void testSetPrecio() {

		m1.setPrecio(PRECIO);

		assertEquals(PRECIO, m1.getPrecio());
	}

	@Test
	void testToString() {
		
		Menu m2 = new Menu(NOMBRE, DESCRIPCION, PRECIO);
		System.out.println(m2.toString());
		
		
	
	}
	

}
