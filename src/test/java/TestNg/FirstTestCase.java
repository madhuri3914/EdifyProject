package TestNg;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority=2)
	void openapp() {
		System.out.println("Opening application");
	}
	@Test(priority=1)
void Login() { 
	System.out.println("Login application");
}
	@Test(priority=0)
void logout() {
	System.out.println("Logout");
}
}
