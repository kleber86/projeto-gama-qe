package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuotePage extends BasePage{

	public SendQuotePage(WebDriver navegador) {
		super(navegador);
	}
	public String validaSendQuote() {
		WebElement valor = navegador.findElement(By.id("sendquote"));
		String textoFinal = valor.getText().substring(0, 10);
		
		return textoFinal;
	}
	public SendQuotePage preencherEmail(String email) {
		navegador.findElement(By.id("email")).sendKeys(email);
		return this;		
	}

	public SendQuotePage preencherPhone(String phone) {
		navegador.findElement(By.id("phone")).sendKeys(phone);
		return this;	
	}

	public SendQuotePage preencheruserName(String userName) {
		navegador.findElement(By.id("username")).sendKeys(userName);
		return this;
	}

	public SendQuotePage preencherPassword(String password) {
		navegador.findElement(By.id("password")).sendKeys(password);
		return this;
		
	}

	public SendQuotePage preencherConfirmPassword(String confirmpassword) {
		navegador.findElement(By.id("confirmpassword")).sendKeys(confirmpassword);
		return this;
	}

	public void clickSend() {
		navegador.findElement(By.id("sendemail")).click();
	}
	
	public String validaFinal() {
		WebElement validaTesxto = navegador.findElement(By.cssSelector(".sweet-alert  h2"));
		return validaTesxto.getText();
	}

}
