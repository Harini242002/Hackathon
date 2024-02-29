package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.carinsurance;
import testbase.Baseclass;

public class TC_02_Car extends Baseclass{
	
	@Test(priority=1,groups= {"regression"})
	public void carinsurances() {
		
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Car Insurance Opening-------------");
		cr.carinsurances();
		
	}
	@Test(priority=2,groups= {"sanity"})
	public void carlocation() {
	
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Selecting Loctaion -------------");
		cr.carlocation();
		
	}
	@Test(priority=3,groups= {"sanity"})
	public void carno() {
		
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Selecting CarNo -------------");
		cr.carno();
		
	}
	@Test(priority=4,groups= {"sanity"})
	public void carbrand() {
		
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Selecting Brand -------------");
		cr.carbrand();
		
	}
	@Test(priority=5,groups= {"sanity"})
	public void carmodel() {
		
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Selecting Model -------------");
		cr.carmodel();
		
	}
	@Test(priority=6,groups= {"sanity"})
	public void carfuel() {
	
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Selecting Fuel -------------");
		cr.carfuel();
		
	}

	
	@Test(priority=7,groups= {"sanity"})
	public void carvariant() {
		
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Selecting Variants-------------");
		cr.carvariant();
		
	}
	@Test(priority=8,groups= {"regression"})
	public void userdetails_and_errormsg() throws IOException {
		
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Filling UserDetails-------------");
		cr.userdetails();
		logger.info("--------------Capturing Error Message-------------");
		cr.errormsg();
		
	}
	@Test(priority=9,groups= {"sanity"})
	public void navigate() {
		
		carinsurance cr=new carinsurance(driver);
		logger.info("--------------Navigating to Main Window -------------");
		cr.navigate();
		
		
	}


}
