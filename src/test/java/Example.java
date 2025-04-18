import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://github.com/");
highlight(driver,driver.findElement(By.className("HeaderMenu-link HeaderMenu-button HeaderMenu-button-muted-outline flex-shrink-0 d-inline-flex d-lg-none no-underline border rounded px-2 py-1 color-fg-inherit js-prevent-focus-on-mobile-nav")));
}

	private static void highlight(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		
	}
}
