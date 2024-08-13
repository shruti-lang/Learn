package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
 static String browser;
 static WebDriver driver;

 public static void main(String[] args) {
	 setBrowser();
	 setBrowserConfig();
	 runTest();

}
 
 public static void setBrowser() {
  browser="Chrome";	
}
 
 public static void setBrowserConfig() {
	  driver = new ChromeDriver();

 }
 
 public static void runTest() {
		driver.get("https://www.ellucian.com/");
		System.out.println(driver.getTitle());
		driver.quit();
 }
	
}
