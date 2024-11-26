package testCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class testBrowsers {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
