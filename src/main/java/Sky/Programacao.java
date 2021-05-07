package Sky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Programacao extends BaseObject {

	public Programacao(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='schedule-block']")
	private WebElement menuprogramacao;
	
	@FindBy(xpath = "//div[@class='schedule-inner schedule-live']")
	private WebElement progcanais;
	
	@FindBy(xpath = "//div[@class='sky-modal-program-title']")
	private WebElement canal;
	
	@FindBy(xpath = "//div[@class='sky-modal-program-title']")
	private WebElement copcanal;
	
	@FindBy(xpath = "//div[@class='sky-modal-program-date-time']")
	private WebElement horaprog;
	
	public void comparar() {	
		Actions menuact = new Actions(driver);
		if(wait.until(ExpectedConditions.elementToBeClickable(menuprogramacao)) != null) {
		if(wait.until(ExpectedConditions.elementToBeClickable(progcanais)).isEnabled()) {
		String nomecanal = progcanais.getText();
		if (progcanais.getText().equals(nomecanal)) {
			menuact.moveToElement(progcanais).click(progcanais).perform();
		}else {
			System.out.println("Canal nao encontrado");
		}
		if(wait.until(ExpectedConditions.elementToBeClickable(canal)).isEnabled()) {
			String progcomp = copcanal.getText();
			progcomp += "\n" + horaprog.getText();
		if(progcomp.equals(nomecanal)) {
			System.out.println("Programação Correta!");
		}else {
			System.out.println("Erro ao validar Programação!");
		}
		}else {
			System.out.println("Ouve um erro no carregamento da Pagina");
		}
		}else {
			System.out.println("Ouve um erro no carregamento da Pagina");
		}
	}else {
		System.out.println("Ouve um erro no carregamento da Pagina");
	}
	}

}
