package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import page.InsurantDataPage;
import page.PriceOptionPage;
import page.ProductDataPage;
import page.SendQuotePage;
import page.VehicleDataPage;

public class VehicleSteps{
	
	WebDriver driver;
	
	@Dado("que estou na pagina da aplicacao")
	public void que_estou_na_pagina_da_aplicacao() {
		Hooks.abrirUrl("http://sampleapp.tricentis.com/101/app.php");
		driver = Hooks.getDriver();
	}
	
	@E("preencho a aba Enter Vehicle Data")
	public void preencho_a_aba_enter_vehicle_data() {
		VehicleDataPage vehiclePage = new VehicleDataPage(driver);
		
		assertEquals("Enter Vehicle Data", vehiclePage.validaVehicleData());	
		
		vehiclePage.selecionaMake("Honda");
		vehiclePage.selecionaModel("Motorcycle");
		vehiclePage.digitarlindercapacity("1000");
		vehiclePage.digitarEnginePerformance("450");
		vehiclePage.digitarDateOfManufacture("01/01/2021");
		vehiclePage.selecionaNumberOfSeats("2");
		vehiclePage.selecionaNumberOfSeatsMotorcycle("2");
		vehiclePage.selecionarFuel("Petrol");	
		vehiclePage.preencherPayLoad("500");		
		vehiclePage.preencherTotalWeight("500");
		vehiclePage.preencherListPrice("100000");
		vehiclePage.preencherAnnualMiLeage("1000");
		vehiclePage.clickNext();		
	}

	@E("preencho a aba Enter Insurant Data")
	public void preencho_a_aba_enter_insurant_data() {
		InsurantDataPage insurantDataPage = new InsurantDataPage(driver);
		
		assertEquals("Enter Insurant Data", insurantDataPage.validaiInsurantDataPage());

		insurantDataPage.preencheFisrtName("Kleber");
		insurantDataPage.preencheLastName("Nascimento");
		insurantDataPage.preencheBirthDate("01/20/1986");
		insurantDataPage.selecionarCountry("Brazil");
		insurantDataPage.preencheZipCode("53130470");		
		insurantDataPage.selecionarOccupation("Unemployed");
		insurantDataPage.SelecionarHobbies();		
		insurantDataPage.clickNext();
	}
	
	@E("preencho a aba Enter Product Data")
	public void preencho_a_aba_enter_product_data() {
		ProductDataPage productDataPage = new ProductDataPage(driver);
	
		assertEquals("Enter Product Data", productDataPage.validaVehicleDataPage());
		
		productDataPage.preencherStartDate("01/01/2022");	
		productDataPage.selecionarInsuranceSum("3000000");		
		productDataPage.selecionarMeritRating("Super Bonus");
		productDataPage.selecionarDamageInsurance("No Coverage");
		productDataPage.SelecionarOptionProducts();		
		productDataPage.selecionarOptionCourtesy("Yes");		
		productDataPage.clickNext();	
	}
	
	@E("preencho a aba Select Price Option")
	public void preencho_a_aba_select_price_option(){
		PriceOptionPage priceOptionPage = new PriceOptionPage(driver);
		
		assertEquals("Select Price Option", priceOptionPage.validaPriceOptionPage());
		
		priceOptionPage.selecionarSilver();
		priceOptionPage.clickNext();   
	}
	
	@E("preencho a aba Send Quote e submeto o formulario")
	public void preencho_a_aba_send_quote_e_submeto_o_formulario() {
		SendQuotePage sendQuotePage = new SendQuotePage(driver);
		
		assertEquals("Send Quote", sendQuotePage.validaSendQuote());
		
		sendQuotePage.preencherEmail("klebernascimento@outlook.com.br");
		sendQuotePage.preencherPhone("90000000");
		sendQuotePage.preencheruserName("klebernascimento");
		sendQuotePage.preencherPassword("Senha@12345");
		sendQuotePage.preencherConfirmPassword("Senha@12345");
		sendQuotePage.clickSend();
	}
	
	@Entao("devo ver a mensagem: {string}")
	public void devo_ver_a_mensagem(String string){
		SendQuotePage sendQuotePage = new SendQuotePage(driver);
		
	    assertEquals(string, sendQuotePage.validaFinal());
	}
}
