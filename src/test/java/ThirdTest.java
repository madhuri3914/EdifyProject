import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {
	public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.slack.com/client/T056J4UTZNF/C08FNMRFWGM");
System.out.println("page title" +driver.getTitle());
	}

}
