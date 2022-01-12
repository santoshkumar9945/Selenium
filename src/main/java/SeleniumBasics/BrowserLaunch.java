package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) 
	{
		WebDriver driver;

		
		
		String browername= "chrome";
		
		if(browername.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaif\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		}if(browername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kaif\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
			
			
			 driver = new FirefoxDriver();
		}if(browername.equals("edge"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kaif\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
			
			
			 driver = new FirefoxDriver();
			
		}else
		{
			System.out.println("please pass the correct browser name");
		}
			
		
		
		
		
		
//		
		
	
		
		
		
		
		
	}
	
	
	
	
	

}
