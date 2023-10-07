package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/v4");
		TakesScreenshot Ts = (TakesScreenshot)driver;
		File Loginpage = Ts.getScreenshotAs(OutputType.FILE);
		File LoginTrg= new File("C:\\Users\\golla\\eclipse-workspace\\Testing\\Screenshot\\Loginpage.png");
		FileUtils.copyFile(Loginpage,LoginTrg);
		
		

	}

}
