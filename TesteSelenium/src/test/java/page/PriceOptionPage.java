package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceOptionPage extends BasePage{

	public PriceOptionPage(WebDriver navegador) {
		super(navegador);
	}
	
	public String validaPriceOptionPage() {
		WebElement valor = navegador.findElement(By.id("selectpriceoption"));
		String textoFinal = valor.getText().substring(0, 19);
		
		return textoFinal;
	}
	
	public PriceOptionPage selecionarSilver() {
		navegador.findElement(By.cssSelector("#selectsilver~span")).click();
		
		return this;
	}
	
	public SendQuotePage clickNext() {
		navegador.findElement(By.id("nextsendquote")).click();
		
		return new SendQuotePage(navegador);
	}

}
