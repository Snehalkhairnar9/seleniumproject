package seleniumpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondtest {

	WebDriver driver = null;
	@BeforeTest
	public void setupTest()
	{
		String projectPath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googlesearch() throws InterruptedException
	{
		// TODO Auto-generated method stub

		driver.get("https://github.com/");
		Thread.sleep(15000);
		driver.findElement(By.name("q")).sendKeys("git actions");
	//	driver.findElement(By.name("btnK")).click();
		Thread.sleep(15000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void downTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test coompleted successfully");
	}

}

