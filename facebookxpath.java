package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kpvenkatesh.mca@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdm");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}

}
