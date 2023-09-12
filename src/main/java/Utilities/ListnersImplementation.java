package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplementation extends BaseClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		 String failedMethod = result.getMethod().getMethodName();
		 System.out.println(failedMethod); 
		 TakesScreenshot ts	= (TakesScreenshot)driver;
		File TempFile = ts.getScreenshotAs(OutputType.FILE);
		File permanentFile=new File("./"+failedMethod+"-Failed.png");
		try {
			FileHandler.copy(TempFile,permanentFile);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
	}

	
}
