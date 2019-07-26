package com.wsdcreat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RebuildFileRisk {

	@Test
	public void RiskResult() throws InterruptedException {

	System.out.println("Create a new analysis file");  
	 
	 ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/CreatAutomationScriptReport.html");
	 
	 ExtentReports extent = new ExtentReports();  
	 
	 extent.attachReporter(reporter);
	 
	 ExtentTest test = extent.createTest("Create a new analysis");
	 
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 
	 driver.get("http://ec2-54-82-196-16.compute-1.amazonaws.com/creat/analysis/list#top");
	 
	//*[@id="body"]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[2]/td[2]
	  
	 
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
	 System.out.println("Scenario Development Summary");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
	 System.out.println("Consequences Primer page will open ");
	 
	        test3.log(Status.INFO, "All the analysis steps in the Scenario Development");

	 test3.log(Status.PASS, "Scenario Development Module 2nd");
	 extent.flush(); 
	 

	 //Test 4rth Consequences & Assets Module 3rd
	 ExtentTest test4 = extent.createTest("Consequences & Assets");  
	 
	 Thread.sleep(2000);
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
	 
	 
	 //Test 5th Consequences & Assets Module 3rd
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
	 
	      
	 Thread.sleep(2000);
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
	 
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
	 System.out.println("Asset/Threat Pairs will open");
	 
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='table1']/table/tbody/tr[1]/td[5]/button")).click();
	 System.out.println("Click on AssetA/T pairs");
	 

	 Thread.sleep(2000);
	 WebElement UBI_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Business')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES1 = new Select(UBI_dropdown);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES1.selectByVisibleText("Low");
	  
	 Thread.sleep(2000);
	 WebElement UED_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Equipment')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES2 = new Select(UED_dropdown);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES2.selectByVisibleText("Low");
	 
	 Thread.sleep(2000);
	 WebElement EI_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Environmental')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES3 = new Select(EI_dropdown);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES3.selectByVisibleText("Medium");
	 
	 
	 Thread.sleep(2000);
	 WebElement RWI_dropdown = driver.findElement(By.xpath(".//select[starts-with(@id,'Source/Receiving Water')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES4 = new Select(RWI_dropdown);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES4.selectByVisibleText("High");
	 
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("numFatalities1")).sendKeys("8");
	 System.out.println("Set on Number Of Fatalities");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("numInjuries1")).sendKeys("9");
	 System.out.println("Set on Number Of Injuries");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[value='Next'][type='submit']")).click();
	 System.out.println("Click on Next button");
	 
	 //-----------------Next page
	 Thread.sleep(2000);
	 WebElement UBI_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Business')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES12 = new Select(UBI_dropdown2);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES12.selectByVisibleText("Low");
	  
	 Thread.sleep(2000);
	 WebElement UED_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Utility Equipment')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES22 = new Select(UED_dropdown2);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES22.selectByVisibleText("Low");
	 
	 Thread.sleep(2000);
	 WebElement EI_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Environmental')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES32 = new Select(EI_dropdown2);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES32.selectByVisibleText("Medium");
	 
	 
	 Thread.sleep(2000);
	 WebElement RWI_dropdown2 = driver.findElement(By.xpath(".//select[starts-with(@id,'Source/Receiving Water')]"));
	 Select ECONOMIC_CONSEQUENCE_CATEGORIES42 = new Select(RWI_dropdown2);
	 Thread.sleep(500);
	 //It wiil select threat "Low"
	 ECONOMIC_CONSEQUENCE_CATEGORIES42.selectByVisibleText("High");
	 
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("numFatalities1")).sendKeys("6");
	 System.out.println("Set on Number Of Fatalities");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.id("numInjuries1")).sendKeys("8");
	 System.out.println("Set on Number Of Injuries");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[value='Next'][type='submit']")).click();
	 System.out.println("Click on Next button");
	 
	 
	 Thread.sleep(2000);
	 JavascriptExecutor js6 = (JavascriptExecutor) driver;
	 WebElement Element6 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']"));
	 System.out.println("Asset/Threat Pairs page click on continue button");
	 
	  //This will scroll the page till the element is found  
	    js5.executeScript("arguments[0].scrollIntoView();", Element6);
	 
	 driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']")).click();
	 System.out.println("Click on continue button");
	 
	 test6.log(Status.INFO, "All the analysis steps in the Risk Assessment");
	 test6.log(Status.PASS, "Risk Assessment Module 5th");
	 extent.flush();
	}
}
