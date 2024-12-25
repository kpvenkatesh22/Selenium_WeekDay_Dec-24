package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountExample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().defaultContent()
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Venkatesh KP");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement indus = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(indus);
		industry.selectByVisibleText("Computer Software");
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(owner);
		ownership.selectByVisibleText("S-Corporation");
		
		WebElement src = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(src);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marcam = driver.findElement(By.id("marketingCampaignId"));
		Select marketcamp = new Select(marcam);
		marketcamp.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateprov = new Select(state);
		stateprov.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.close();
		
		driver.findElement(By.className(null));
		
		}

}
