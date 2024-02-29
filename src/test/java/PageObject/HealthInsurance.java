package PageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Excel;

public class HealthInsurance extends BasePage{
	
	public HealthInsurance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@FindBy(xpath="//a[contains(text(),'Insurance Products ')]")
	WebElement HealthInsurance;
	@FindBy(xpath="(//div[@class='ruby-col-3 hidden-md'])[2]/ul/li")
	List <WebElement> healthinsurance_menu;
	public void healthinsurance() {
		HealthInsurance.click();
		 
	}
	public void printmenu() throws IOException {
		int row=1;
		for(WebElement list2:healthinsurance_menu) {
			Excel.write("Sheet1",0,3,"Health Insurance Menu");
				Excel.write("Sheet1",row,3,list2.getText());
				row++;
				System.out.println(""+list2.getText());
			}
		
	}
	}
