package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.travel;
import testbase.Baseclass;

public class TC_01_Travel extends Baseclass{

@Test(priority=1,groups= {"regression"})
	public void  traveldetails() {
	travel t=new travel(driver);
	 logger.info("---------------Location Choosed---------");
		t.travellocation();
		
		
		
	}
@Test(priority=2,groups= {"sanity"})
	public void date() throws InterruptedException, IOException {
	travel t=new travel(driver);
	logger.info("---------------Date Selecting---------");
	t.DateClicking();
	
		
	}
@Test(priority=3,groups= {"regression"})
public void notravellers() throws InterruptedException, IOException {
travel t=new travel(driver);
logger.info("---------------Choosing No of Travellers---------");
t.nooftravellers();
	
}
@Test(priority=4,groups= {"sanity"})
public void travellerdetails() throws InterruptedException, IOException {
travel t=new travel(driver);
logger.info("--------------Filling travellers Age -------------");
t.travellerdetails();
	
}
@Test(priority=5,groups= {"sanity"})
public void medicalcondition() {
	travel t=new travel(driver);
	logger.info("--------------Medical Condition -------------");
t.travellersmedicalcondition();

	
}
@Test(priority=6,groups= {"sanity"})
public void mobile() throws IOException {
	travel t=new travel(driver);
	logger.info("--------------Filling Mobile Number -------------");
t.mobilenumber();
	
}
@Test(priority=7,groups= {"regression"})
public void studentplans() throws InterruptedException {
	travel t=new travel(driver);
	logger.info("--------------Selecting student plan -------------");
t.studentplan();
	
}
@Test(priority=8,groups= {"sanity"})
public void sortby() throws IOException, InterruptedException  {
	travel t=new travel(driver);
	logger.info("--------------Sorting Low to High -------------");
t.sortBy();
	
}
@Test(priority=9,groups= {"sanity"})
public void navigate()  {
	travel t=new travel(driver);
	logger.info("--------------Navigating to Main Window -------------");
t.navigate();
	
}

}
