package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class VehicleDataPage extends BasePage{
	
	public VehicleDataPage(WebDriver navegador) {
		super(navegador);
	}
	
	public String validaVehicleData() {
		WebElement valor = navegador.findElement(By.id("entervehicledata"));
		String textoFinal = valor.getText().substring(0, 18);
		
		return textoFinal;
	}
	
	public VehicleDataPage selecionaMake(String make){
		WebElement elemento = navegador.findElement(By.id("make"));
		Select select = new Select(elemento);
		select.selectByValue(make);
		return this;
	}
	
	public VehicleDataPage selecionaModel(String model){
		WebElement elemento = navegador.findElement(By.id("model"));
		Select select = new Select(elemento);
		select.selectByValue(model);
		return this;
	}
	
	public VehicleDataPage digitarlindercapacity(String linderCapacity){
        navegador.findElement(By.id("cylindercapacity")).sendKeys(linderCapacity);
        return this;
    }
	
	public VehicleDataPage digitarEnginePerformance(String linderCapacity){
        navegador.findElement(By.id("engineperformance")).sendKeys(linderCapacity);
        return this;
    }

	public VehicleDataPage digitarDateOfManufacture(String dateOfManufacture) {
		navegador.findElement(By.id("dateofmanufacture")).sendKeys(dateOfManufacture);
		return this;
	}
	
	public VehicleDataPage selecionaNumberOfSeats(String numberOfSeats){
		WebElement elemento = navegador.findElement(By.id("numberofseats"));
		Select select = new Select(elemento);
		select.selectByValue(numberOfSeats);
		return this;
	}

	public VehicleDataPage selecionaNumberOfSeatsMotorcycle(String numberOfSeatsMotorcycle) {
		WebElement elemento = navegador.findElement(By.id("numberofseatsmotorcycle"));
		Select select = new Select(elemento);
		select.selectByValue(numberOfSeatsMotorcycle);
		return this;
	}

	public VehicleDataPage selecionarFuel(String fuel) {
		WebElement elemento = navegador.findElement(By.id("fuel"));
		Select select = new Select(elemento);
		select.selectByValue(fuel);
		return this;
	}

	public VehicleDataPage preencherPayLoad(String payLoad) {
		navegador.findElement(By.id("payload")).sendKeys(payLoad);
		return this;	
	}

	public VehicleDataPage preencherTotalWeight(String totalWeight) {
		navegador.findElement(By.id("totalweight")).sendKeys(totalWeight);
		return this;	
	}

	public VehicleDataPage preencherListPrice(String listPrice) {
		navegador.findElement(By.id("listprice")).sendKeys(listPrice);
		return this;	
		
	}

	public VehicleDataPage preencherAnnualMiLeage(String annualMiLeage) {
		navegador.findElement(By.id("annualmileage")).sendKeys(annualMiLeage);
		return this;
	}
	
	public InsurantDataPage clickNext() {
		navegador.findElement(By.id("nextenterinsurantdata")).click();
		
		return new InsurantDataPage(navegador);
	}

}
