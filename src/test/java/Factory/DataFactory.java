package Factory;

import org.testng.annotations.Factory;

public class DataFactory {
	@Factory
	public Object[] createInstances() {
		return new Object[] {
				new Lead("admin@yopmail.com","123456","madhuri","madhuri@gmail.com","9908088453"),
				new Lead("admin@yopmail.com","123456","nishanth","nishanth@gmail.com","9640138524"),
		};
	}

}
