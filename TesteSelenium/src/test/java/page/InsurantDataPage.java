package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage extends BasePage{

	public InsurantDataPage(WebDriver navegador) {
		super(navegador);
	}

	public InsurantDataPage preencheFisrtName(String firstName) {
		navegador.findElement(By.id("firstname")).sendKeys(firstName);
		return this;	
	}

	public InsurantDataPage preencheLastName(String lastName) {
		navegador.findElement(By.id("lastname")).sendKeys(lastName);
		return this;
	}
	
	public InsurantDataPage preencheBirthDate(String birthDate) {
		navegador.findElement(By.id("birthdate")).sendKeys(birthDate);
		return this;
	}
	
	public InsurantDataPage selecionarCountry(String country) {
		WebElement elemento = navegador.findElement(By.id("country"));
		Select select = new Select(elemento);
		select.selectByValue(country);
		return this;
	}
	
	public InsurantDataPage preencheZipCode(String zipCode) {
		navegador.findElement(By.id("zipcode")).sendKeys(zipCode);
		return this;
	}
	
	public InsurantDataPage selecionarOccupation(String occupation) {
		WebElement elemento = navegador.findElement(By.id("occupation"));
		Select select = new Select(elemento);
		select.selectByValue(occupation);
		return this;
	}
	
	public void SelecionarHobbies() {
		navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]")).click();
	}
	
	public ProductDataPage clickNext() {
		navegador.findElement(By.id("nextenterproductdata")).click();
		
		return new ProductDataPage(navegador);
	}

	public String validaiInsurantDataPage() {
		WebElement valor = navegador.findElement(By.id("enterinsurantdata"));
		String textoFinal = valor.getText().substring(0, 19);
		
		return textoFinal;
		
	}
}
