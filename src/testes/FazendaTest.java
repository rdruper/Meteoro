package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import principal.Coordenada;
import principal.Fazenda;


public class FazendaTest {
	
	Fazenda faz;
	
	
	@Before
    public void setUp() {
				
		faz = new Fazenda(new Coordenada(10,10), new Coordenada(20,20));
		
		
    }
	
	@Test
	public void testCountMeteoros() {		
		
				
		faz.cair(new Coordenada(15, 11));
		
        assertEquals(1, faz.getNumMet());
	}

}
