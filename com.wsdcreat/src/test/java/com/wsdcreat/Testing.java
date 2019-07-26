package com.wsdcreat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	
	@Test
	public void ResumeAnalysis() throws InterruptedException {

	
	 ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/CreatAutomationScriptReport.html");
	 
	 ExtentReports extent = new ExtentReports();  
	 
	 extent.attachReporter(reporter);
	 
	 ExtentTest test = extent.createTest("Continue Build Analysis file");
	 
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 
	 driver.get("http://ec2-54-82-196-16.compute-1.amazonaws.com/creat/analysis/list#top");
	 
	
	 //*[@id="body"]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[5]/td[1]/a
	 Thread.sleep(3000);
	 String before_xpath = "//*[@id='body']/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[";
	 String after_xpath = "]/td[2]";
	 
	 for(int i=2; i<=35; i++ ){
	  String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
	  System.out.println(name);
	  
	  if(name.contains("WRD Lakewood Demo File")){
	   
	   driver.findElement(By.xpath("//*[@id='body']/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr["+i+"]/td[1]/a")).click();
	   break;
	   
	  }
	 } 
	 
	 driver.manage().window().maximize();
	 System.out.println("2.1");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("a[data-toggle='collapse'][data-target='#climateAwareness']")).click();
	 System.out.println("Click on climate Awareness");
	 
	//*[@id='climateAwareness']/ul/li[1]/a/text()
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector("a[class='ng-binding completed'][ng-disabled='!step.completed && !step.alwaysAccessible && !module.subMenu[$index-1].completed']")).click();
	 System.out.println("Click on Utility information");
	 
	 Thread.sleep(2000);  
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
  
	 //This will scroll the page till the element is found  
    js.executeScript("arguments[0].scrollIntoView();", Element);

    driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
    System.out.println("Click on continue button");
    
	 Thread.sleep(2000);  
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js1.executeScript("arguments[0].scrollIntoView();", Element1);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2ndpage continue button");
    
	 Thread.sleep(2000);  
	 JavascriptExecutor js2 = (JavascriptExecutor) driver;
	 WebElement Element2 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js2.executeScript("arguments[0].scrollIntoView();", Element2);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 3rdPage continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js3 = (JavascriptExecutor) driver;
	 WebElement Element3 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js3.executeScript("arguments[0].scrollIntoView();", Element3);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 4thPage continue button");
     
     Thread.sleep(2000); 
     driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();
     System.out.println("Click on 5thPage continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js4 = (JavascriptExecutor) driver;
	 WebElement Element4 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js3.executeScript("arguments[0].scrollIntoView();", Element4);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2nd module 1st continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js5 = (JavascriptExecutor) driver;
	 WebElement Element5 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js5.executeScript("arguments[0].scrollIntoView();", Element5);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2nd module 2nd continue button");
    
	 Thread.sleep(2000);  
	 JavascriptExecutor js6 = (JavascriptExecutor) driver;
	 WebElement Element6 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js6.executeScript("arguments[0].scrollIntoView();", Element6);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2nd module 3rd continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js7 = (JavascriptExecutor) driver;
	 WebElement Element7 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js7.executeScript("arguments[0].scrollIntoView();", Element7);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2nd module 4th continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js8 = (JavascriptExecutor) driver;
	 WebElement Element8 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js8.executeScript("arguments[0].scrollIntoView();", Element8);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2nd module 5th continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js9 = (JavascriptExecutor) driver;
	 WebElement Element9 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js9.executeScript("arguments[0].scrollIntoView();", Element9);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2nd module 6th continue button");
     
     Thread.sleep(2000); 
     
     driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 2nd module completed the Scenario Development module");
     
     Thread.sleep(2000); 
     
     driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 3rd module 1st Continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js10 = (JavascriptExecutor) driver;
	 WebElement Element10 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js10.executeScript("arguments[0].scrollIntoView();", Element10);

	 driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']")).click();

     System.out.println("Click on 3rd module 2nd continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js11 = (JavascriptExecutor) driver;
	 WebElement Element11 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js11.executeScript("arguments[0].scrollIntoView();", Element11);

	 driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']")).click();

     System.out.println("Click on 3rd module 3rd continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js12 = (JavascriptExecutor) driver;
	 WebElement Element12 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js12.executeScript("arguments[0].scrollIntoView();", Element12);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 3rd module 4th continue button");
     
     Thread.sleep(2000); 
     
     driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 3rd module 5th continue button");
     
     Thread.sleep(2000); 
     
     driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 4th module 1st Continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js13 = (JavascriptExecutor) driver;
	 WebElement Element13 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js13.executeScript("arguments[0].scrollIntoView();", Element13);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 4th module 2nd continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js14 = (JavascriptExecutor) driver;
	 WebElement Element14 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js14.executeScript("arguments[0].scrollIntoView();", Element14);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 4th module 3rd continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js15 = (JavascriptExecutor) driver;
	 WebElement Element15 = driver.findElement(By.cssSelector("button[value='Continue'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js15.executeScript("arguments[0].scrollIntoView();", Element15);

	 driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 4th module 4th continue button");
     
     Thread.sleep(2000); 
     
     driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 4th module 5th continue button");
     
     Thread.sleep(2000); 
     
     driver.findElement(By.cssSelector("button[value='Continue'][type='submit']")).click();

     System.out.println("Click on 5th module 1st continue button");
     
	 Thread.sleep(2000);  
	 JavascriptExecutor js16 = (JavascriptExecutor) driver;
	 WebElement Element16 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js16.executeScript("arguments[0].scrollIntoView();", Element16);

	 driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']")).click();

     System.out.println("Click on 5th module 2nd continue button");
     
     Thread.sleep(2000);  
	 JavascriptExecutor js17 = (JavascriptExecutor) driver;
	 WebElement Element17 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js17.executeScript("arguments[0].scrollIntoView();", Element17);

	 driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']")).click();

     System.out.println("Click on 5th module 3rd continue button");
     
     Thread.sleep(2000);  
	 JavascriptExecutor js18 = (JavascriptExecutor) driver;
	 WebElement Element18 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']"));
 
	 //This will scroll the page till the element is found  
	 js18.executeScript("arguments[0].scrollIntoView();", Element18);

	 driver.findElement(By.cssSelector("button[class='btn btn-default btn-blue w-arrow'][type='submit']")).click();

     System.out.println("Click on 5th module 4th continue button");
     
	 test.log(Status.INFO, "In Existing Analysis List resume button");
	 test.log(Status.PASS, "Successfully see analysis progress page start continue analysis where we left or review analysis progress file.");
	 extent.flush();
	 driver.close();
 
	}

}
