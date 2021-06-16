package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage extends BasePage{

	public ProductDataPage(WebDriver navegador) {
		super(navegador);
	}
	
	public String validaVehicleDataPage() {
		WebElement valor = navegador.findElement(By.id("enterproductdata"));
		String textoFinal = valor.getText().substring(0, 18);
		
		return textoFinal;
	}
	
	public ProductDataPage preencherStartDate(String startDate) {
		navegador.findElement(By.id("startdate")).sendKeys(startDate);
		return this;
	}

	public ProductDataPage selecionarInsuranceSum(String insuranceSum) {
		WebElement elemento = navegador.findElement(By.id("insurancesum"));
		Select select = new Select(elemento);
		select.selectByValue(insuranceSum);
		return this;
	}

	public ProductDataPage selecionarMeritRating(String meritRating) {
		WebElement elemento = navegador.findElement(By.id("meritrating"));
		Select select = new Select(elemento);
		select.selectByValue(meritRating);
		return this;	
	}

	public ProductDataPage selecionarDamageInsurance(String damageInsurance) {
		WebElement elemento = navegador.findElement(By.id("damageinsurance"));
		Select select = new Select(elemento);
		select.selectByValue(damageInsurance);
		return this;
	}
	
	public void SelecionarOptionProducts() {
		navegador.findElement(By.cssSelector("#EuroProtection~span")).click();
	}

	public ProductDataPage selecionarOptionCourtesy(String courtesyCar) {
		WebElement elemento = navegador.findElement(By.id("courtesycar"));
		Select select = new Select(elemento);
		select.selectByValue(courtesyCar);
		return this;
	}

	public PriceOptionPage clickNext() {
		navegador.findElement(By.id("nextselectpriceoption")).click();
		
		return new PriceOptionPage(navegador);
	}
}
