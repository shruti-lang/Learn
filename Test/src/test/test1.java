package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	
	public static void main(String[] args) {
		
		System.out.println("test");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ellucian.com/");
		driver.quit();
	}

}
