package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IniciarTeste extends BaseClass{
	
	@Before
	public void iniciarNavegador() {
		iniciarAplicacao();
	}
	
	@Test
	public void inciarTeste() {
		iniciopagina.iniciarMenu();
		programacao.comparar();
	}
	
	@After
	public void finalizarTeste() throws Exception {
		finalizarAplicacao();
	}

}
