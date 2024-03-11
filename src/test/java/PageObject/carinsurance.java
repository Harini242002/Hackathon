package PageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Excel;

public class carinsurance extends BasePage{

	public carinsurance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	 
	@FindBy(xpath="(//div[@class='shadowHandlerBox'])[4]")
	WebElement carInsurance;
	@FindBy(xpath="//*[@class='btn-proceed']")
	WebElement newcar1;
	@FindBy(xpath="//*[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")
	WebElement newcar2;
	@FindBy(id="spn6")
	WebElement carlocation1;
	@FindBy(xpath="//span[contains(text(),'Chennai')]")
	WebElement carlocation2;
	@FindBy(xpath="//*[text()='TN14']")
	WebElement carno1;
	@FindBy(xpath="//li[contains(text(),'TN14')]")
	WebElement carno2;
	@FindBy(xpath="//*[@class='maruti']")
	WebElement carbrand1;
	@FindBy(xpath="//li[contains(@class,'maruti')]")
	WebElement carbrand2;
	@FindBy(xpath="//*[@data-modelid='482']/span")
	WebElement carmodel1;
	@FindBy(xpath="//li[contains(text(),'CELERIO')]")
	WebElement carmodel2;
	@FindBy(id="Diesel")
	WebElement carfueltype1;
	@FindBy(xpath="//li[contains(text(),'Diesel')]")
	WebElement carfueltype2;
	@FindBy(xpath="//*[@data-variantid='2952']/span")
	WebElement carvariant1;
	@FindBy(xpath="//li[contains(text(),'ZDI (793 cc)')]")
	WebElement carvariant2;
	@FindBy(xpath="//*[@id='name']")
	WebElement Username1;
	@FindBy(xpath="(//input[contains(@class,'form-control')])[1]")
	WebElement Username2;
	@FindBy(id="email")
	WebElement Email1;
	@FindBy(xpath="(//input[contains(@class,'form-control')])[2]")
	WebElement Email2;
	@FindBy(id="mobileNo")
	WebElement Mobile1;
	@FindBy(xpath="(//input[contains(@class,'form-control')])[3]")
	WebElement Mobile2;
	@FindBy(xpath="//*[@class='msg-error show']")
	WebElement errormsg1;
	@FindBy(xpath="//*[@class='errorMsg']")
	WebElement errormsg2;
	@FindBy(xpath="//*[@class='pb-logo']")
	WebElement mainpage1;
	@FindBy(xpath="//*[@class='logo']")
	WebElement mainpage2;
	JavascriptExecutor js=(JavascriptExecutor)driver;

	public void carinsurances() {
		carInsurance.click();
		try{
			
			newcar2.click();
		}
		catch(Exception e) {
		if(newcar1.isDisplayed()){
			js.executeScript("arguments[0].click();", newcar1);
		}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void carlocation() {
		try {
			carlocation2.click();
		}
		catch(Exception e) {
			if(carlocation1.isDisplayed()){
		
			carlocation1.click();
		}
	}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void carno() {
		try {
			carno2.click();
		}
		catch(Exception e) {
		if(carno1.isDisplayed()) {
			carno1.click();
		}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void carbrand() {
		try {
			carbrand2.click();
		}
		catch(Exception e) {
		if(carbrand1.isDisplayed()){
			carbrand1.click();
		}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void carmodel() {
		
		try {
			carmodel2.click();
		}
		catch(Exception e) {
		 if(carmodel1.isDisplayed()){
			carmodel1.click();
		}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void carfuel() {
	try {
			carfueltype2.click();
		}
	catch(Exception e) {	
	if(carfueltype1.isDisplayed()) {
			carfueltype1.click();
		}
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void carvariant() {
		
		try {
			carvariant2.click();
		}
		catch(Exception e) {
		if(carvariant1.isDisplayed()){
			carvariant1.click();
		}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void userdetails() throws IOException {
		try {
			Username2.sendKeys(Excel.getCellData("Sheet1", 3, 0));
			Email2.sendKeys(Excel.getCellData("Sheet1", 4, 0));
			Mobile2.sendKeys(Excel.getCellData("Sheet1", 5, 0));
		
		}
		catch(Exception e) {
		 if(Username1.isDisplayed()){
			Username1.sendKeys(Excel.getCellData("Sheet1", 3, 0));
			Email1.sendKeys(Excel.getCellData("Sheet1", 4, 0));
			Mobile1.sendKeys(Excel.getCellData("Sheet1", 5, 0));
		}
		}
		
	}
	public void errormsg() throws IOException {
		try {				
					System.out.println("Error Message : "+errormsg2.getText());			
		}
		catch(Exception e) {
		if(errormsg1.isDisplayed()){				
				System.out.println("Error Message : "+errormsg1.getText());
			}
		
		}		
	}
	
	public void navigate() {
		try {
			mainpage2.click();
		}
		catch(Exception e) {
	 if(mainpage1.isDisplayed()) {
			mainpage1.click();
			}
		}
	}
} 
