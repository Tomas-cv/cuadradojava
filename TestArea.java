package www.unlam.edu.ar;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestArea {
	@Test
	
	public void testAreaCuadrado() {
		Cuadrado miCuadrado = new Cuadrado(4);
		Integer areaEsperada = 16;
		Integer areaObtenida = miCuadrado.calcularArea();

		Assert.assertEquals(areaEsperada, areaObtenida);


		
	}

}
