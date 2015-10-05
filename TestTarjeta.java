import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;


public class TestTarjeta {
	
	@Test
	public void test (){
		
		Colectivo c = new Colectivo("Mixta", "115", 2);
		Tarjeta t = new Tarjeta(10, c);
		Viaje v = new Viaje(c);
		
		assertEquals("A test for Tarjeta String", "Saldo", t.saldo());
		assertEquals("A test for Tarjeta String", "Saldo", t.pagarBoleto(c));
		assertEquals("A test for Tarjeta String", "Saldo", t.recarga(4));
		
	}
}
