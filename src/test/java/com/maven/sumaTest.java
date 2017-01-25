package com.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumaTest {

	@Test
	public void sumaPositivos() {
		 System.out.println("Sumando dos números positivos ...");
	     Suma S = new Suma(2, 3);
	     assertTrue(S.sumar() == 5);
	}
	
	@Test
	public void sumaNegativos() {
	       System.out.println("Sumando dos números negativos ...");
	       Suma S = new Suma(-2, -3);
	       assertTrue(S.sumar() == -5);
	}
}
