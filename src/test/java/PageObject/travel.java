package PageObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utilities.Excel;


public class travel extends BasePage{

	public travel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions act=new Actions (driver);
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String Fromdate=timestamp.substring(6,8);
		int Todate=Integer.parseInt(Fromdate)+2;
		String Enddate="3";
				//Integer.toString(Todate);
		
		@FindBy(xpath="(//*[@class='shadowHandlerBox'])[7]")
		WebElement travelinsurance;
		@FindBy(xpath="//*[@class='countryButton']/p[text()='Germany']")
		WebElement Germany;
		@FindBy(xpath="//*[@class='travel_main_cta']")
		WebElement Next;
		@FindBy(xpath="(//*[contains(@class,'MuiInputBase-root')])[1]")
		WebElement Date1;
		@FindBy(xpath="(//*[contains(@class,'MuiInputBase-root')])[2]")
		WebElement Date2;
		 
		@FindBy(xpath="//*[contains(@class,'MuiPickersDateRangeDay-rangeIntervalPreview')]")
		List<WebElement> Datepicking;
		
		@FindBy(xpath="//label[contains(text(),'2')]")
		WebElement numberoftravellers;
		@FindBy(xpath="(//*[contains(@class,'customDropdown__select  ')])[1]")
		WebElement traveller1;
		@FindBy(xpath="//div[@class='options_box_wrapper__option']")
		List<WebElement> Ageoftraveller1;
		@FindBy(xpath="(//*[contains(@class,'customDropdown__select  ')])[2]")
		WebElement traveller2;
		@FindBy(xpath="//*[contains(@id,'ped_no')]")
		WebElement medicalcondition;
		@FindBy(id="mobileNumber")
		WebElement mobilenumber;
		@FindBy(id="studentTrip")
		WebElement pickstudentplan;
		@FindBy(id="Traveller_1")
		WebElement clicktraveller1;
		@FindBy(id="Traveller_2")
		WebElement clicktraveller2;
		@FindBy(id="feet")
		WebElement pickdays;
		@FindBy(xpath="//summary/p[text()='Sort by']")
		WebElement sortby;
		@FindBy(xpath="//label[text()='Premium low to high']")
		WebElement Clicklowtohigh;
		@FindBy(xpath="//*[@class='quotesCard--insurerName']")
		List<WebElement> insurance_provider_company;
		@FindBy(xpath="//*[@class='premiumPlanPrice']")
		List<WebElement> insurance_provider_company_amount;
		@FindBy(xpath="//*[@class='row_wrap']/h1/a")
		WebElement mainpage;
		
		public void travellocation() {
			travelinsurance.click();
			js.executeScript("arguments[0].click();", Germany);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		}
		public void DateClicking() {
			Next.click();
			Date1.click();
			for(int i=0;i<Datepicking.size();i++) {
				if(Datepicking.get(i).getText().equals(Fromdate)) {
					Datepicking.get(i).click();
					break;
					
				}
				
			}
//			Date1.click();
//			Date2.click();
			for(int i=0;i<Datepicking.size();i++) {
				if(Datepicking.get(i).getText().equals(Fromdate)) {
					Datepicking.get(i+25).click();
					break;
					
				}
				
			}
			
			
			
		}
		public void nooftravellers() {
			Next.click();
			numberoftravellers.click();
		}
		public void travellerdetails() throws IOException {
			
			js.executeScript("arguments[0].click();", traveller1);
			for(int i=0;i<Ageoftraveller1.size();i++) {
				if(Ageoftraveller1.get(i).getText().equals(Excel.getCellData("Sheet1", 1, 0))) {
					Ageoftraveller1.get(i).click();
					break;
					
				}
				
			}
			js.executeScript("arguments[0].click();", traveller2);
			for(int i=0;i<Ageoftraveller1.size();i++) {
				if(Ageoftraveller1.get(i).getText().equals(Excel.getCellData("Sheet1", 2, 0))) {
					Ageoftraveller1.get(i).click();
					break;
					
				}
				
			}
			
						
		}
		public void travellersmedicalcondition() {
			Next.click();
			medicalcondition.click();
			
		}
		public void mobilenumber() throws IOException {
			mobilenumber.click();
			mobilenumber.sendKeys(Excel.getCellData("Sheet1", 0, 0));
			Next.click();
		}
		public void studentplan()  {
			pickstudentplan.click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			js.executeScript("arguments[0].click();",clicktraveller1);
			js.executeScript("arguments[0].click();",clicktraveller2);
			Select s=new Select(pickdays);
		    s.selectByVisibleText("30 Days");
		    Next.click();
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void sortBy() throws IOException, InterruptedException {
			js.executeScript("arguments[0].click();", sortby);
			Thread.sleep(2000);

			js.executeScript("arguments[0].click();", Clicklowtohigh);
			int row=1;
			for(int i=0;i<3;i++) {
			Excel.write("Sheet1",0,0,"Insurance Provider Company");
			Excel.write("Sheet1",row,0,insurance_provider_company.get(i).getText());
			row++;
			}
			int r=1;
			for(int j=0;j<=2;j++) {
				Excel.write("Sheet1",0,1,"Insurance Provider Company Price");
				Excel.write("Sheet1",r,1,insurance_provider_company_amount.get(j).getText());
				r++;
			
			}
			for(int k=0;k<3;k++) {
				
			
			System.out.println(insurance_provider_company.get(k).getText()+"="+insurance_provider_company_amount.get(k).getText());
			}				
		}
		public void navigate() {
			act.moveToElement(mainpage).click().perform();
			
		}
	}


