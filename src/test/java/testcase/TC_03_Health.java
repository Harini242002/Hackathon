package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.HealthInsurance;
import testbase.Baseclass;

public class TC_03_Health extends Baseclass {
	
	@Test(priority=1,groups= {"regression"})
	public void Healthinsurance() {
		HealthInsurance hi=new HealthInsurance(driver);
		hi.healthinsurance();
	
	}
	@Test(priority=2,groups= {"regression"})
	public void Healthinsurance_menu() throws IOException {
		HealthInsurance hi=new HealthInsurance(driver);
		logger.info("--------------Printing Menu -------------");
		hi.printmenu();
	}

}
