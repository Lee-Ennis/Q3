package pkg1;

import static org.junit.Assert.*;


import org.junit.Test;


public class TriTest {
	@Test
	public void tri_test(){
		Triangle tri1 = new Triangle(5, 12 ,13);
		assertEquals(tri1.getPerimeter(), 30, 0);
		assertEquals(tri1.getArea(), 30, 0);
		assertEquals(tri1.getSide1(), 5, 0);
		assertEquals(tri1.getSide2(), 12, 0);
		assertEquals(tri1.getSide3(), 13, 0);
		
		assertEquals(tri1.toString(), "Side lengths:" + 5 + "," + 12 + "and" + 13 +
				"Perimeter:" + 30 +
				"Area:" + 30);
		
	}
}

