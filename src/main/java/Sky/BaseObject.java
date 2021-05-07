package Sky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseObject {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BaseObject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

}
