package Practicing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthScript {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/shorts/MEDYb44vVSE");
		System.out.println("page title" +driver.getTitle());
		
}

}
