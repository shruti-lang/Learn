package headlessbrowser;

import org.openqa.selenium.WebDriver;

public class PhantomJS implements WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("phantomjs.binary.path", "C:\\Learn\\Test\\lib\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe")
		PhantomJSDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.ellucian.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		}

}
