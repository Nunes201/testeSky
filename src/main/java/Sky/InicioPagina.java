package Sky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InicioPagina extends BaseObject{

	public InicioPagina(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_YQcCxObpxg0J\"]/div/div[2]/div/div[2]/div/div/div/div[1]/button")
	private WebElement click;
	
	@FindBy(xpath = "//span[@class='sky_icon sky-icon-line-close icon_md icon-round close-message']")
	private WebElement span;
	
	@FindBy(xpath = "//a[@href='/programacao']")
	private WebElement botprogramacao;
	
	public void iniciarMenu() {
		if(wait.until(ExpectedConditions.elementToBeClickable(click)).isEnabled() && wait.until(ExpectedConditions.elementToBeClickable(span)).isEnabled()){
		wait.until(ExpectedConditions.elementToBeClickable(click)).click();
		wait.until(ExpectedConditions.elementToBeClickable(span)).click();
		Actions focomenu = new Actions(driver);
		focomenu.moveToElement(botprogramacao);
		botprogramacao.click();
		}else {
			System.out.println("Ouve um erro no carregamento da Pagina");
		}
	}

}
