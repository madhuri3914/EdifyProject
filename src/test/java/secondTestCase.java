import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTestCase {
public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://github.com/");
	System.out.println("pagetitle"+driver.getTitle());
	
}
}
