# Hackathon

***************************************************** PROJECT DESCRIPTION *****************************************************************

Problem Statement : Find the insurance plans

1. Open PolicyBazaar and display three lowest international  travel insurance plan with amount and insurance provider company for any European country.
2. In car insurance capture the error message.
3. In health insurance display all the menu items.

Detailed Description: Hackathon Project

1. Open PolicyBazaar website and select travel insurance.
2. In travel insurance select the location -> choose travel date -> choose no.of travellers and their age -> pass mobile number.
3. Select student plan and sort them.
4. Display first three travel plans for students and store the same in excel.
5. In car insurance select Buy a new car.
6. Select city -> select vehicle number -> select brand -> select model -> select fuel.
7. Fill the details like name, mobile number and pass invalid email.
8. Capture the error message.
9. In health insurance display all the menu items and store the same in excel.

Key Automation Scope:

1. Handling alerts, search option
2. Validation of date controls
3. Filling simple form, Capture warning message
4. Extract menu items & store in collections
5. Navigating back to home page



********************************************************** STEPS TO EXECUTE *************************************************************

-unzip the folder
-On eclipse, go to file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-Now the file will Execute in TestNG and we get the expected output as shown below.
-Now go to TestRunner.java file and run as JUnit test.
-Now the file will Execute in Cucumber and we get the expected output as shown below.


******************************************************* FILES DESCRIPTION **************************************************************

1. src/test/java - There are seven packages present in this folder.

-> Factory			: In this package we have CucumberBaseClass.java file in which we invoke the browser initialization, we also added logger 				  and properties method to include logs and access config.properties file.
  	
-> PageObjects   		: In this Package there are four files
    	1) BasePage     	: In this file we have implemeted pagefactory which has a Factory class to make using Page Objects simpler and easier and 				  also used WebDriver constructor.
  	2) CarInsurance 	: In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and 					  methods to perform required actions in car insurance page.
  	3) HealthInsurance      : In this file we extends basePage.java and we included required action methods and Webelements to get the desired result.
  	4) TravelInsurance      : In this file we extends basePage.java where the constructor is intiated from basePage and we have some elements and 					  methods to perform required actions in travel insurance page. 

-> StepDefinitions   		: In this package there are four files
  	1) Car			: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in car insurance page
  	2) Health  		: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in health insurance page
  	3) Hooks  		: In this file we have invoked browser setup, closing the browser and also included the screenshot method.
  	4) Travel  		: In this file we have included required methods which are implemented by cucumber feature files to perform required actions 				  in travel insurance page

-> TestBase  			: In this Package we have BaseClass.java file in which we Firstly invoke the selected browser and we add steps like Opening 				  the PolicyBazaar page (https://www.policybazaar.com/) and closing the browser ,We also added screenshot method
     
-> TestCases  			: In this package we have three files 
  	1) TC_01_Travel.java    : This file extends BaseClass.java where the methods are present which will choose location, select travel date, choose 				  no.of travellers, fill mobile number, print first three travel plans and store in excel.
  	2) TC_02_Car.java	: This file extends BaseClass.java where the methods will choose city, vehicle number, brand, model, fuel, fill the required 				  details and capture the error message.
  	3) TC_03_Health.java	: This file extends BaseClass.java where the methods will select health insurance, display all the menu items and store in 				  excel. 

-> TestRunner  			: In this package we have TestRunner.java file where we include features file path and add cucumber plugins to generate 				  cucumber report.	  

-> Utilities   			: In this package we have ExcelUtils.java and ExtendreportManager.java file.

2. src/test/resources - In this folder, there are three files 

-> config.properties  		: This file is used to store the reusable values such as apprl,browser name and os name.

-> log4j2.xml  			: This file is used to generate log informations about the execution of test cases.

-> extent.properties  		: This file is used to generate the extentReport for the execution in cucumber framework.

3. JRE System Library		: In this File we have all dependencies of JAR.files.         

4. Maven Dependencies		: In this File we have all the directory on the local machine, where all the project artifacts are stored. When a Maven 				  build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this 					  directory is named.

5. Feature Files 		: In this folder we have all the feature files with .feature extension which needs to be invoked while excuting the project 				  in cucumber framework.

6. Logs 				: In this folder logs are present which is generated while executing the project.

7. Reports 			: In this folder the Test-Report-YYYY.MM.DD.html and CucumberReport.html are present which is the reports of the project

8. ScreenShot			: In this folder all the screenshots are captured while executing the project.

9. src				: In this, there are two folders
				     -main:It is an empty folder
				     -test:It is an empty folder

10. target			: It is an empty folder

11. TestData 			: In this folder we have two files

-> Read  			: In this excel file all the data which need to be passed to required WebElements are stored.

-> Write  			: After the execution of project the result will be stored in this file. 

12. Test-output			: This folder is used to store the cucumber extent reports.

13. pom.xml			: The pom.xml file contains information of project and configuration information for the maven to build the project such as 				  dependencies, build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, 				  then executes the goal.

14. CrossBrowserTestNG.xml	: In this file test classes are defined for cross browser execution.

15. MasterTestNG.xml		: In this file test classes are defined for executing the project in only one browser

16. run.bat			: This file is included to run the project in command prompt 

 
****************************************************** OUTPUT ON CONSOLE *********************************************************************************

******************************************************************** TESTNG OUTPUT ***********************************************************************

[RemoteTestNG] detected TestNG version 7.4.0

12:43:15.453 [main] INFO  testcase.TC_01_Travel - ---------------Location Choosed---------
12:43:19.055 [main] INFO  testcase.TC_01_Travel - ---------------Date Selecting---------
12:43:22.325 [main] INFO  testcase.TC_01_Travel - ---------------Choosing No of Travellers---------
12:43:22.895 [main] INFO  testcase.TC_01_Travel - --------------Filling travellers Age -------------
12:43:25.710 [main] INFO  testcase.TC_01_Travel - --------------Medical Condition -------------
12:43:26.347 [main] INFO  testcase.TC_01_Travel - --------------Filling Mobile Number -------------
12:43:27.464 [main] INFO  testcase.TC_01_Travel - --------------Selecting student plan -------------
12:43:36.681 [main] INFO  testcase.TC_01_Travel - --------------Sorting Low to High -------------

Reliance=₹1,514
Bajaj Allianz=₹1,628
Niva Bupa (formerly known as Max Bupa)=₹2,089

12:43:39.792 [main] INFO  testcase.TC_01_Travel - --------------Navigating to Main Window -------------
12:43:41.489 [main] INFO  testcase.TC_01_Travel - --------------Car Insurance Opening-------------
12:43:45.918 [main] INFO  testcase.TC_01_Travel - --------------Selecting Loctaion -------------
12:43:46.491 [main] INFO  testcase.TC_01_Travel - --------------Selecting CarNo -------------
12:43:46.722 [main] INFO  testcase.TC_01_Travel - --------------Selecting Brand -------------
12:43:47.243 [main] INFO  testcase.TC_01_Travel - --------------Selecting Model -------------
12:43:48.006 [main] INFO  testcase.TC_01_Travel - --------------Selecting Fuel -------------
12:43:48.524 [main] INFO  testcase.TC_01_Travel - --------------Selecting Variants-------------
12:43:48.870 [main] INFO  testcase.TC_01_Travel - --------------Filling UserDetails-------------
12:43:49.106 [main] INFO  testcase.TC_01_Travel - --------------Capturing Error Message-------------

Error Message : Please enter a valid e-mail ID.

12:43:49.314 [main] INFO  testcase.TC_01_Travel - --------------Navigating to Main Window -------------
12:43:51.869 [main] INFO  testcase.TC_01_Travel - --------------Printing Menu -------------

Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs
Health Insurance Claim

===============================================
Suite
Total tests run: 20, Passes: 20, Failures: 0, Skips: 0
===============================================


**************************************************************** CUCUMBER OUTPUT ************************************************************************

@sanity @regression
Scenario: Displays the travel insurance plan for students       
 Given user navigates to the home page                          stepDefinition.travelStep.user_navigates_to_the_home_page()

    Embedding Displays the travel insurance plan for students [image/png 262235 bytes]


When user selects the location and date                        stepDefinition.travelStep.user_selects_the_location_and_date()

    Embedding Displays the travel insurance plan for students [image/png 332693 bytes]

  And user selects number of travellers                          stepDefinition.travelStep.user_selects_number_of_travellers()

    Embedding Displays the travel insurance plan for students [image/png 224207 bytes]

 And user selects no for medical                                stepDefinition.travelStep.user_selects_no_for_medical()

    Embedding Displays the travel insurance plan for students [image/png 260730 bytes]

And User enters the mobile number                              stepDefinition.travelStep.user_enters_the_mobile_number()

    Embedding Displays the travel insurance plan for students [image/png 232467 bytes]

 And user selects the student plan and select the travellers  stepDefinition.travelStep.user_selects_the_student_plan_and_select_the_travellers()

    Embedding Displays the travel insurance plan for students [image/png 204855 bytes]

Reliance=₹1,514
Bajaj Allianz=₹1,628
Niva Bupa (formerly known as Max Bupa)=₹2,089

 Then user selects the sorting and displays the insurance plans stepDefinition.travelStep.user_selects_the_sorting_and_displays_the_insurance_plans()

    Embedding Displays the travel insurance plan for students [image/png 263226 bytes]


@sanity @regression
Scenario: Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message Feature/2car.feature:

Given user navigates to the main page                             stepDefinition.carStep.user_navigates_to_the_main_page()

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 277297 bytes]

  When user selects the buying new car option  			stepDefinition.carStep.user_selects_the_buying_new_car_option()                                                                            

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 156747 bytes]

  And user selects location                                   stepDefinition.carStep.user_selects_location()

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 199793 bytes]

  And user selects carno                                         stepDefinition.carStep.user_selects_carno()

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 199965 bytes]

  And User selects the carbrand                                 stepDefinition.carStep.user_selects_the_carbrand()

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 253341 bytes]

  And user selects the carmodel                                   stepDefinition.carStep.user_selects_the_carmodel()                                                                                              

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 197751 bytes]

  And user selects carfuel                                      stepDefinition.carStep.user_selects_carfuel()

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 168770 bytes]

  And User selects the carvariant            			stepDefinition.carStep.user_selects_the_carvariant()                                                                                                           

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 193446 bytes]

  And user fills the userdetails                 		stepDefinition.carStep.user_fills_the_userdetails()                                                                                                       

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 193392 bytes]

Error Message : Please enter a valid e-mail ID.

  Then capture the Error message 				stepDefinition.carStep.capture_the_error_message()                                                                                                                       

    Embedding Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message [image/png 278350 bytes]


@sanity @regression
Scenario: Displays the Health insurance Menu   Feature/3health.feature:4
  Given user navigates to the Menu page        stepDefinition.HealthStep.user_navigates_to_the_Menu_page()

    Embedding Displays the Health insurance Menu [image/png 197191 bytes]

  When user selects the Health Insurance Menu  stepDefinition.HealthStep.user_selects_the_health_insurance_menu()

    Embedding Displays the Health insurance Menu [image/png 160227 bytes]



Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs
Health Insurance Claim
  Then Display Health Insurance Menu           stepDefinition.HealthStep.display_health_insurance_menu()

    Embedding Displays the Health insurance Menu [image/png 160111 bytes]

