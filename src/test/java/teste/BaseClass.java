package teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Sky.InicioPagina;
import Sky.Programacao;

public abstract class BaseClass {

	protected WebDriver driver;
	protected InicioPagina iniciopagina;
	protected Programacao programacao;
	
	public void iniciarAplicacao() {
		System.setProperty(Config.NOME_DRIVER, Config.CAMINHO_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.URL_APLICACAO);
		
		iniciopagina = new InicioPagina(driver);
		programacao = new Programacao(driver);
	}
	
	public void finalizarAplicacao() throws Exception{
		Thread.sleep(6000);
		driver.quit();
	}
	
}
