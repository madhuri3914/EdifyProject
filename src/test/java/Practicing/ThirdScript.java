package Practicing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdScript {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.rms.digitaledify.ai/");
		System.out.println("page title" +driver.getTitle());
}

}
