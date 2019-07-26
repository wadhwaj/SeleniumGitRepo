package com.wsdcreat;


import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectedScenarios {
			
		@Test
		public  void BuildNewAnalysis() throws InterruptedException{
		 
			 System.out.println("Create a new analysis file");  
			 
			 ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/CreatAutomationScriptReport.html");
			 
			 ExtentReports extent = new ExtentReports();  
			 
			 extent.attachReporter(reporter);
			 
			 ExtentTest test = extent.createTest("Create a new analysis");
			 
			 WebDriverManager.chromedriver().setup();
			 
			 WebDriver driver = new ChromeDriver();
			 
			 driver.get("http://ec2-54-82-196-16.compute-1.amazonaws.com/creat/analysis/list#top");
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 driver.findElement(By.className("title")).click();
			 System.out.println("1");
			 String parent = driver.getWindowHandle();
			 System.out.println("Parent window id is "+parent);
			 
			 String child = driver.getWindowHandle();
			 
			 driver.switchTo().window(child);
			   
			 System.out.println("child window title is "+driver.getTitle());
			 
			 Thread.sleep(1000);
			 //Test analysis build file
			 
			 String uuid = UUID.randomUUID().toString();
			 //----------------------      
			 driver.findElement(By.name("analysisName")).sendKeys("Analysis for automation Testing " + uuid);
			// driver.findElement(By.name("analysisName")).sendKeys("Analysis for automation " );
			  System.out.println("2");
			 //-----------------------------------------------
			 //Thread.sleep(2000);
			 
			 //Click on close X   
			 //driver.findElement(By.className("close")).click();
			 
			 //Click on cancel button
			 //driver.findElement(By.cssSelector("input[type='button']")).click();
			 
			 //Click on Save button  
			 driver.findElement(By.cssSelector("button[type='submit']")).click();
			 
			 
			 driver.switchTo().window(parent);
			 
			 driver.manage().window().maximize();

			 System.out.println("3");
			  
			 test.log(Status.INFO, "Build a new analysis file");
			 
			 test.log(Status.PASS, "Successfully bulid a new analysis");
			 extent.flush();
			 
			 // Test 2nd Climate Awareness Module 1st
			 
			 ExtentTest test2 = extent.createTest("Climate Awareness");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 
			 System.out.println("1.1.1");

			 driver.findElement(By.name("utilityName")).sendKeys("Test's house");
			 
			 driver.findElement(By.name("address")).sendKeys("123 Fairfax Drive");
			 
			 driver.findElement(By.name("city")).sendKeys("Fairfax");
			 
			 driver.findElement(By.name("state")).sendKeys("Virginia");
			 
			 driver.findElement(By.name("zip")).sendKeys("20152");
			 
			 driver.findElement(By.name("populationServed")).sendKeys("4000");
			 
			 driver.findElement(By.name("SystemType")).sendKeys("Water Only");
			 
			 driver.findElement(By.name("gallonsPerDay")).sendKeys("10");
			     
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			      
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 
			 System.out.println("2.1");

			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div/div[1]/div/div[4]/div[2]")).click();
			 System.out.println("2.2");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div/div[1]/div/div[9]/div[2]")).click();
			 System.out.println("2.3");
			 
			 Thread.sleep(2000);  
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("2.4");
			 
			 Thread.sleep(2000);  
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("2.5");
			 
			 test2.log(Status.INFO, "All the analysis steps in the Climate Awareness");
			 test2.log(Status.PASS, "Climate Awareness Module 1st");
			 extent.flush(); 

			//---------------------------------------------------------------------- 
			 //Test 3rd Scenario development module2nd
			 ExtentTest test3 = extent.createTest("Scenario development");
			 
			 // Scenario Primer page 
			 Thread.sleep(2000);  
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Threat Identification page open ");
			 
			 Thread.sleep(2000);  
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Baseline Scenario page open ");
			 
			 Thread.sleep(2000);  
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 WebElement Element = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
			  
			  //This will scroll the page till the element is found  
			    js.executeScript("arguments[0].scrollIntoView();", Element);

			    driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			    System.out.println("Time Period page open");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[2]/input")).sendKeys("2049");
			 System.out.println("2.6");
			 
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[2]/input")).sendKeys(Keys.RETURN);
			 System.out.println("2.7");
			 
			 try{
			  driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[2]/input")).clear();
			 }catch(Exception e)
			 {
			  System.out.println("clear text data");
			 }
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[2]/input")).sendKeys("2049");
			 System.out.println("2.8");
			 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Projected Scenarios page open");
			 
			 
			// add Projected Scenarios
			 //*[@id="body"]/div[2]/div/div[3]/div[3]/div/div/div/div[2]/div/div[1]/button
			 
			 
			 Thread.sleep(2000);
			 JavascriptExecutor js1_1 = (JavascriptExecutor) driver;
			 WebElement Element1_1= driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[3]/div[3]/div/div/div/div[2]/div/div[1]/button"));
			  
			  //This will scroll the page till the element is found  
			    js1_1.executeScript("arguments[0].scrollIntoView();", Element1_1);
			 
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[3]/div[3]/div/div/div/div[2]/div/div[1]/button")).click();
			 System.out.println("Add Scenario will page open");
			 
			
			 
			 Thread.sleep(2000);   
			 driver.findElement(By.cssSelector("input[type='text'][id='name']")).sendKeys("Hotter and Drier scenario");
			 System.out.println("Hotter and Drier scenario");
			 
			 Thread.sleep(2000);   
			 driver.findElement(By.cssSelector("textarea[type='text'][id='description']")).sendKeys("This is if hotter and drier");
			 System.out.println("Description: This is if hotter and drier");
			 
			 Thread.sleep(2000);   
			 driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div/div[2]/form/fieldset/div[3]/div/div[4]/div[2]")).click();
			 System.out.println("Hotter and Drier Future Conditions");
			 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg'][type='submit']")).click();
			 System.out.println("On Scenario Definition page click on next buttton");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg ng-scope'][type='submit']")).click();
			 System.out.println("click on next buttton");
			 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg ng-scope'][type='submit']")).click();
			 System.out.println(" click on Save buttton");
			 
			 //-------------------
			 
			 Thread.sleep(2000);
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
			 WebElement Element1 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
			  
			  //This will scroll the page till the element is found  
			    js1.executeScript("arguments[0].scrollIntoView();", Element1);
			 
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Threat Definition page open");
			 
			 Thread.sleep(2000);
			 WebElement Threat_dropdown = driver.findElement(By.name("threatType"));
			 Select Threat_type = new Select(Threat_dropdown);
			 Thread.sleep(2000);
			 //It wiil select threat "Loss of wetlands"
			 Threat_type.selectByVisibleText("Loss of wetlands");
			 
			 Thread.sleep(2000);
			 WebElement Threat_dropdown2nd = driver.findElement(By.xpath("//*[text()='Floods']//following::select[@name='threatType']"));
			 Select Threat_type2nd = new Select(Threat_dropdown2nd);
			 Thread.sleep(2000);
			 //It wiil select threat "Coastal storm surges"
			 Threat_type2nd.selectByVisibleText("Coastal storm surges");
			 
			 Thread.sleep(2000);
			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 WebElement Element2 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
			  
			  //This will scroll the page till the element is found  
			    js2.executeScript("arguments[0].scrollIntoView();", Element2);
			 
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Next Threat Scenario page will come");
			 //------------------
			 
			 Thread.sleep(2000);
			 WebElement HADThreat_dropdown = driver.findElement(By.name("threatType"));
			 Select HADThreat_type = new Select(HADThreat_dropdown);
			 Thread.sleep(2000);
			 //It wiil select threat "Loss of wetlands"
			 HADThreat_type.selectByVisibleText("Loss of wetlands");
			 System.out.println("Select HAD Threat");
			 
			 Thread.sleep(2000);
			 WebElement HADThreat_dropdown2nd = driver.findElement(By.xpath("//*[text()='Floods']//following::select[@name='threatType']"));
			 Select HADThreat_type2nd = new Select(HADThreat_dropdown2nd);
			 Thread.sleep(2000);
			 //It wiil select threat "Coastal storm surges"
			 HADThreat_type2nd.selectByVisibleText("Coastal storm surges");
			 System.out.println("Select HAD Threat from Flood");
			 
			 
			 
			 Thread.sleep(2000);
			 JavascriptExecutor js21 = (JavascriptExecutor) driver;
			 WebElement Element21 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
			  
			  //This will scroll the page till the element is found  
			 js21.executeScript("arguments[0].scrollIntoView();", Element21);
			 
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Scenario Development Summary");
			 
			 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Consequences Primer page will open ");
			 
			 test3.log(Status.INFO, "All the analysis steps in the Scenario Development");

			 test3.log(Status.PASS, "Scenario Development Module 2nd");
			 extent.flush(); 
			
			 //Test 4rth Consequences & Assets Module 3rd
			 ExtentTest test4 = extent.createTest("Consequences & Assets"); 
			 
			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			 
			 
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Economic Consequences Matrix page will open");
			 
			 Thread.sleep(2000);
			 JavascriptExecutor js3 = (JavascriptExecutor) driver;
			 WebElement Element3 = driver.findElement(By.cssSelector("button[type='submit']"));
			  
			  //This will scroll the page till the element is found  
			    js3.executeScript("arguments[0].scrollIntoView();", Element3);
			 
			 Thread.sleep(2000);  
			 driver.findElement(By.cssSelector("button[type='submit']")).click();
			 System.out.println("Public Health Consequences page will open");
			 
			 Thread.sleep(2000);  
			 driver.findElement(By.cssSelector("button[type='submit']")).click();
			 System.out.println("Asset Definition page will open");
			 
			 Thread.sleep(2000);  
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div[2]/div[1]/button")).click();
			 System.out.println("Add Asset link page will open");
			   
			 Thread.sleep(2000);  
			 driver.findElement(By.xpath("//*[@id='_11780']/span[1]")).click();
			 System.out.println("Ecological Resources will see");
			 
			 Thread.sleep(2000);   
			 driver.findElement(By.cssSelector("input[type='button'][value='Select']")).click();
			 System.out.println("Select Forested Lands");
			 
			 
			 Thread.sleep(2000);   
			 driver.findElement(By.cssSelector("textarea[type='textarea'][name='description']")).sendKeys("A growth of trees and other plants covering a large area.");
			 System.out.println("Select Forested Lands");
			 
			 Thread.sleep(2000);
			 JavascriptExecutor js4 = (JavascriptExecutor) driver;
			 WebElement Element4 = driver.findElement(By.cssSelector("button[class='btn btn-blue'][ng-click='modalCtrl.save()']"));
			 System.out.println("save button find");
			 
			  //This will scroll the page till the element is found  
			    js4.executeScript("arguments[0].scrollIntoView();", Element4);
			 
			 Thread.sleep(8000); 
			 driver.findElement(By.cssSelector("button[class='btn btn-blue'][ng-click='modalCtrl.save()']")).click();
			 System.out.println("Assert will save");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='table']/table/tbody/tr/td[1]/div/label")).click();
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Consequences and Assets Summary page will open");
			 
			 test4.log(Status.INFO, "All the analysis steps in the Consequences & Assets");
			 test4.log(Status.PASS, "Consequences & Assets Module 3rd");
			 extent.flush(); 
			 
			 
			 //Test 5th Consequences & Adaptation planning 3rd
			 ExtentTest test5 = extent.createTest("Adaptation Planning");  
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Adaptation Planning Primer page will open");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Existing Adaptive Measures page will open");
			 
			 Thread.sleep(2000);
			 JavascriptExecutor js5 = (JavascriptExecutor) driver;
			 WebElement Element5 = driver.findElement(By.cssSelector("button[value='Select from Adaptive Measures Library'][type='button']"));
			 System.out.println("Select from Adaptive Measures Library element");
			 
			  //This will scroll the page till the element is found  
			    js5.executeScript("arguments[0].scrollIntoView();", Element5);
			 
			 driver.findElement(By.cssSelector("button[value='Select from Adaptive Measures Library'][type='button']")).click();
			 System.out.println("Existing Adaptive Measures page will open");
			 
			      
			 Thread.sleep(10000);
			 driver.findElement(By.cssSelector("button[class='close'][type='button']")).click();
			 System.out.println(" Select from Adaptive Measures Library page close");
			 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Add Existing Adaptive Measure'][type='button']")).click();
			 System.out.println("Add Existing Adaptive Measure");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[type='text'][name='measureName']")).sendKeys("Altered Treatment- Total Dissolved Solids");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("textarea[type='textarea'][name='measureDesc']")).sendKeys("Alter treatment to be more adaptive to changes in water quality, temperature, and flow rates. These technologies should be able to be integrated into current operations and suitable for performance under current conditions");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[name='capitalCost'][id='capitalCostMin']")).sendKeys("1,000");
			 System.out.println("Add minimum cost");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[name='capitalCost'][id='capitalCostMax']")).sendKeys("7,000");
			 System.out.println("Add maximum cost");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div[2]/form/div[1]/fieldset/div[5]/div/div[2]/label[2]")).click();
			 driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div[2]/form/div[1]/fieldset/div[6]/div/div[2]/label[2]")).click();
			 System.out.println(" Select relevent");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg ng-binding']")).click();
			 System.out.println(" click on Save button");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Click on Continue button");
			 
			 driver.getTitle();
			 
/*
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Add Existing Adaptive Measure'][type='button']")).click();
			 System.out.println("Add potential Adaptive measure");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[type='text'][name='measureName']")).sendKeys("Facility Location");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("textarea[type='textarea'][name='measureDesc']")).sendKeys("Relocate utility structure such as treatment plants and pump stations to higher elevations to reduce risks from coastal flooding and exposure as a result of coastal erosion or wetlands loss.");
			 driver.findElement(By.cssSelector("input[name='capitalCost'][id='capitalCostMin']")).sendKeys("1,000");
			 System.out.println("Add minimum cost");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[name='capitalCost'][id='capitalCostMax']")).sendKeys("6,000");
			 System.out.println("Add maximum cost");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div[2]/form/div[1]/fieldset/div[5]/div/div[2]/label[2]")).click();
			 driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div[2]/form/div[1]/fieldset/div[6]/div/div[2]/label[2]")).click();
			 System.out.println(" Select relevent");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg ng-binding']")).click();
			 System.out.println(" click on Save button");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Click on Continue button");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[class='btn btn-add btn-add-lg'][ng-click='AdaptationPlans.createPlan()']")).click();
			 System.out.println("Click on Add plans");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[id='name'][type='text']")).sendKeys("Current Measures");
			 System.out.println("Added Plan name");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[id='description'][type='text']")).sendKeys("Existing adaptive measures.");
			 System.out.println("Added Plan Discription");

			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div[2]/form/div[2]/table/tbody/tr/td[4]/div")).click();
			 System.out.println("Click on Checkbox");
			 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary btn-lg ng-scope']")).click();
			 System.out.println(" click on Save button");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Adaptation Plans page continue button");
			 
			 			 									 
			 test5.log(Status.INFO, "All the analysis steps in the Adaptation Planning");
			 test5.log(Status.PASS, "Adaptation Planning Module 4th ");
			 extent.flush(); 
	 
			 

			//---------------------------------------------------------------------- 
			 //Test 5th Risk Assessment module 5th
			 
			 ExtentTest test6 = extent.createTest("Risk Assessment"); 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Risk Primer page will open");
			 
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
			 System.out.println("Asset/Threat Pairs will open");
			//*[@id="table1"]/table/tbody/tr[1]/td[5]/button
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='table1']/table/tbody/tr[1]/td[5]/button")).click();
			 System.out.println("Click on AssetA/T pairs");
			 
		
			 Thread.sleep(2000);
			 WebElement UBI_dropdown_HAD = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Business')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES_HAD = new Select(UBI_dropdown_HAD);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES_HAD.selectByVisibleText("Low");
			 System.out.println("from UBI in BS level ");
			 
			 Thread.sleep(2000);
			 WebElement UBI_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Business') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES = new Select(UBI_dropdown);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES.selectByVisibleText("Low");
			 System.out.println("from UBI in Hotter and Drier Scenario level ");

			 Thread.sleep(2000);
			 WebElement UED_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Equipment ')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES2 = new Select(UED_dropdown);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES2.selectByVisibleText("Low");
			 System.out.println("from UED in BS level ");
			 
			 Thread.sleep(2000);
			 WebElement UED_dropdown_HAD = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Equipment') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES2_HAD = new Select(UED_dropdown_HAD);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES2_HAD.selectByVisibleText("Medium");
			 System.out.println("from UED in BS level ");
			 
			 Thread.sleep(2000);
			 WebElement EI_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Environmental')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES3 = new Select(EI_dropdown);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES3.selectByVisibleText("Medium");
			 
			 			
			 Thread.sleep(2000);
			 WebElement EI_dropdown_HAD = driver.findElement(By.xpath(".//select[starts-with(@id,'Environmental') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES3_HAD = new Select(EI_dropdown_HAD);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES3_HAD.selectByVisibleText("Medium");
			 
			 
			 Thread.sleep(2000);
			 WebElement RWI_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Source/Receiving Water')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES4 = new Select(RWI_dropdown);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES4.selectByVisibleText("High");
			 
			 
			 Thread.sleep(2000);
			 WebElement RWI_dropdown_HAD = driver.findElement(By.xpath(".//select[starts-with(@id,'Source/Receiving Water') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES4_HAD = new Select(RWI_dropdown_HAD);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES4_HAD.selectByVisibleText("High");
			 
			 			 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numFatalities1")).sendKeys("8");
			 System.out.println("Set on Number Of Fatalities");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numInjuries1")).sendKeys("9");
			 System.out.println("Set on Number Of Injuries");
		
		 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numFatalities2")).sendKeys("6");
			 System.out.println("Set on Number Of Fatalities");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numInjuries2")).sendKeys("8");
			 System.out.println("Set on Number Of Injuries");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[value='Next'][type='submit']")).click();
			 System.out.println("Click on Next button");
			 
			 			 
			 Thread.sleep(2000);
			 WebElement UBI_dropdown_HAD2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Business')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES_HAD2 = new Select(UBI_dropdown_HAD2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES_HAD2.selectByVisibleText("Low");
			 System.out.println("from UBI in BS level ");
			 
			 Thread.sleep(2000);
			 WebElement UBI_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Business') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES22 = new Select(UBI_dropdown2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES22.selectByVisibleText("Low");
			 System.out.println("from UBI in Hotter and Drier Scenario level ");

			 Thread.sleep(2000);
			 WebElement UED_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Equipment ')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES222 = new Select(UED_dropdown2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES222.selectByVisibleText("Low");
			 System.out.println("from UED in BS level ");
			 
			 Thread.sleep(2000);
			 WebElement UED_dropdown_HAD2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Equipment') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES2_HAD2 = new Select(UED_dropdown_HAD2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES2_HAD2.selectByVisibleText("Medium");
			 System.out.println("from UED in BS level ");
			 
			 Thread.sleep(2000);
			 WebElement EI_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Environmental')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES32 = new Select(EI_dropdown2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES32.selectByVisibleText("Medium");
			 
			 			
			 Thread.sleep(2000);
			 WebElement EI_dropdown_HAD2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Environmental') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES3_HAD2 = new Select(EI_dropdown_HAD2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES3_HAD2.selectByVisibleText("Medium");
			 
			 
			 Thread.sleep(2000);
			 WebElement RWI_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Source/Receiving Water')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES42 = new Select(RWI_dropdown2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES42.selectByVisibleText("High");
			 
			 
			 Thread.sleep(2000);
			 WebElement RWI_dropdown_HAD2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Source/Receiving Water') and contains(@class,'ng-pristine')]"));
			 Select ECONOMIC_CONSEQUENCE_CATEGORIES4_HAD2 = new Select(RWI_dropdown_HAD2);
			 Thread.sleep(500);
			 //It wiil select threat "Low"
			 ECONOMIC_CONSEQUENCE_CATEGORIES4_HAD2.selectByVisibleText("High");
			 
			 			 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numFatalities1")).sendKeys("6");
			 System.out.println("Set on Number Of Fatalities");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numInjuries1")).sendKeys("5");
			 System.out.println("Set on Number Of Injuries");
		
		 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numFatalities2")).sendKeys("4");
			 System.out.println("Set on Number Of Fatalities");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.id("numInjuries2")).sendKeys("3");
			 System.out.println("Set on Number Of Injuries");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[value='Next'][type='submit']")).click();
			 System.out.println("Click on Next button");
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			 JavascriptExecutor js6 = (JavascriptExecutor) driver;
			 WebElement Element6 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']"));
			 System.out.println("Asset/Threat Pairs page click on continue button");
			 //This will scroll the page till the element is found  
			  js5.executeScript("arguments[0].scrollIntoView();", Element6);
			 Thread.sleep(500);
			 driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']")).click();
			 System.out.println("Click on continue button");
			 
			 test6.log(Status.INFO, "All the analysis steps in the Risk Assessment");
			 test6.log(Status.PASS, "Risk Assessment Module 5th");
			 extent.flush(); 

			   //Test 7th Verify Resource Library
			 
			 ExtentTest test7 = extent.createTest("Verify Resource Library"); 
			 //*[@id='body']/div[1]/div/div[1]/div/ul/li[2]/a
			 //*[@id="body"]/div[1]/div/div[1]/div/ul/li[1]/a
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[1]/div/div[1]/div/ul/li[1]/a")).click();
			 System.out.println("Click on Get Started button");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[1]/div/div[1]/div/ul/li[2]/a")).click();
			 System.out.println("Click on Next button");
			    
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg'][type='submit']")).click();
			 System.out.println("Click on close button");
			     
			 test7.log(Status.INFO, "Creating Resilient Water Utilities Initiative Resources, Climate Change Threats  Information , Adaptation Planning and Impementation Funding Opportunities and Other Resourcesh");
			 test7.log(Status.PASS, "Resource Library page open successfully");
			 extent.flush(); 
			 
			 
			   //Test 8th Click Resume button to continue build analysis file
			 ExtentTest test8 = extent.createTest("Resume button"); 
			 
			 //*[@id="body"]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[5]/td[1]/a
			 Thread.sleep(3000);
			 String before_xpath = "//*[@id='body']/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[";
			 String after_xpath = "]/td[2]";
			 
			 for(int i=2; i<=35; i++ ){
			  String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			  System.out.println(name);
			  
			  if(name.contains("Test Analysis")){
			   
			   driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr["+i+"]/td[1]/a")).click();
			   break;
			   
			  }
			 } 
			 
			 driver.manage().window().maximize();
			 System.out.println("2.1");
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[1]/div/div[1]/div/ul/li[1]/a")).click();
			 System.out.println("Click on Get Started button");
			   
			 test8.log(Status.INFO, "In Existing Analysis List resume button");
			 test8.log(Status.PASS, "Successfully see analysis progress page start continue analysis where we left or review analysis progress file.");
			 extent.flush();
			 
			   //Test 9th Rebuild existing analysis
			 ExtentTest test9 = extent.createTest("Rebuild existing analysis"); 
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div[2]")).click();

			 System.out.println("1");
			 
			 System.out.println("Parent window id is "+parent);
			 
			 String child1 = driver.getWindowHandle();
			 
			 driver.switchTo().window(child1);
			 
			 Thread.sleep(1000);
			 
			 //*[@id='body']/div[4]/div/div/div[2]/div[1]/table/tbody/tr[5]/td[2]
			 //*[@id="body"]/div[4]/div/div/div[2]/div[1]/table/tbody/tr[2]/td[2]
			 Thread.sleep(3000);
			 String Rebefore_xpath = "//*[@id='body']/div[4]/div/div/div[2]/div[1]/table/tbody/tr[";
			 String Reafter_xpath = "]/td[2]";
			 
			 for(int i=2; i<=35; i++ ){
			  String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			  System.out.println(name);
			  
			  if(name.contains("WCA Test analysis7-12")){
			   
			   driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div[2]/div[1]/table/tbody/tr["+i+"]/td[2]")).click();
			   break;
			   
			  }
			 } 
			 
			 System.out.println("2.1");
			 
			 Thread.sleep(3000);
			 driver.findElement(By.cssSelector("input[name='analysisName'][type='text']")).sendKeys("WCA Test analysis7-12"  + uuid);
			 System.out.println("New analysis name");
			 
			 //*[@id='body']/div[4]/div/div/div[2]/div[2]/button[2]
			 
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id='body']/div[4]/div/div/div[2]/div[2]/button[2]")).click();
			 System.out.println("click on Rebuild button");
			 
			 test9.log(Status.INFO, "Choose one analysis file which would like to rebuild and and click on Rebulid");
			 test9.log(Status.PASS, "Successfully Rebuild existing analysis file and rename");
			 extent.flush();
			 
			 driver.close();
		*/
		}
}
