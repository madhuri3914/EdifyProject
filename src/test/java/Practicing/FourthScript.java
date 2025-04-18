package Practicing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthScript {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	System.out.println("page title" + driver.getTitle());

}
}
