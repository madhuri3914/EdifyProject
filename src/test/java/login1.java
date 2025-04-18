
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class login1 {
		public static void main(String args[]) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://dev.crm.digitaledify.ai/");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		}
		

	}



