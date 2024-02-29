package PageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
	 
	@FindBy(xpath="(//*[@class='shadowHandlerBox'])[4]")
	WebElement carInsurance;
	@FindBy(xpath="//*[@class='btn-proceed']")
	WebElement newcar;
	@FindBy(id="spn6")
	WebElement carlocation;
	@FindBy(xpath="//*[text()='TN14']")
	WebElement carno;
	@FindBy(xpath="//*[@class='maruti']")
	WebElement carbrand;
	@FindBy(xpath="//*[@data-modelid='482']/span")
	WebElement carmodel;
	@FindBy(id="Diesel")
	WebElement carfueltype;
	@FindBy(xpath="//*[@data-variantid='2952']/span")
	WebElement carvariant;
	@FindBy(xpath="//*[@id='name']")
	WebElement Username;
	@FindBy(id="email")
	WebElement Email;
	@FindBy(xpath="//*[@class='msg-error show']")
	List<WebElement> errormsg;
	@FindBy(xpath="//*[@class='pb-logo']")
	WebElement mainpage;
	
	public void carinsurances() {
		carInsurance.click();
		newcar.click();
	}
	public void carlocation() {
		carlocation.click();
		
		
		
		
	}
	public void carno() {
		
		carno.click();
		
		
		
	}
	public void carbrand() {
		carbrand.click();
		
	}
	public void carmodel() {
		
		carmodel.click();
	}
	public void carfuel() {
		carfueltype.click();
		
	}
	public void carvariant() {
		
		carvariant.click();
	}
	public void userdetails() throws IOException {
		Username.sendKeys(Excel.getCellData("Sheet1", 3, 0));
		Email.sendKeys(Excel.getCellData("Sheet1", 4, 0));
	}
	public void errormsg() throws IOException {
		for(WebElement list:errormsg) {
			
					System.out.println("Error Message : "+list.getText());
				}
			
			
		}
	
	public void navigate() {
		mainpage.click();
	}
}
