package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class extentTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReportor extents;
	ExtentTest testCase;
	String ExpectedText= "Hello vasuvespag!";
  @Test
  public void verifyUrl() {
	  testCase=extent.createTest("Validate Greeting");
	  driver=new ChromeDriver();
	  driver.get("https://adactinhotelapp.com/");
	  driver.findElement(By.id("username")).sendKeys("vasuvespag");
	  driver.findElement(By.id("password")).sendKeys("vasu1234");
	  driver.findElement(By.id("login")).clear();
	  String Greeting=driver.findElement(By.id("username"))
	  
  }
}
