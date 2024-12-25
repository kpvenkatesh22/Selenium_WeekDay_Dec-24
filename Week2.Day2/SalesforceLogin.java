package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//div[@id='pwcaps']/following-sibling::input")).click();
		driver.close();

	}

}
