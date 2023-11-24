package TestCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import PomClasses.CartPageTest;

import PomClasses.HomePageAfterLoginTest;
import PomClasses.Womens;
import Utilities.BaseClass;
import Utilities.JavaScriptUtilities;


@Listeners(Utilities.ListnersImplementation.class)
public class VerifyWomwensModuleTest extends BaseClass{

	@Test
	public void Tc_Women_003Test() throws Throwable {
		
		System.out.println("Test case 1");
		JavaScriptUtilities jse = new JavaScriptUtilities();
		CartPageTest cp = new CartPageTest(driver);
		WebElement ele= cp.getRayYonSleeveLength();
		jse.javaScriptClick(driver,ele);
	}
	
	@Test
	public void Tc_Women_004Test() throws Throwable {
		System.out.println("Test case 2");
	}
	
	
	@Test
	public void Tc_Women_005Test() throws Throwable {
		System.out.println("Test case 3");
	}
	
}
