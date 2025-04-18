package Practicing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixthScript {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aha.video/app/login");
		System.out.println("page title" +driver.getTitle());
	}

}
