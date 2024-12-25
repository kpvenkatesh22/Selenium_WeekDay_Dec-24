package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		//Getting the title of the page
		String title = driver.getTitle();
		System.out.println("This Page is: "+title);
		
		//Finding the first book of the page
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Books",Keys.ENTER);
		String book = driver.findElement(By.xpath("//h2[contains(@class,'a-size-medium a-spacing-none')]/span")).getText();
		System.out.println("Book Name is: " +book);
		
		//Finding the first book price of the page
		String val = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("String Value from Amazon: "+val);
		String strval = val.replaceAll(",", "");
		System.out.println("String Value after relacing the comma(,) is: "+strval);
		
		//String to Integer
		int bookprice = Integer.parseInt(strval);
		System.out.println("The Book Price is in integer: "+bookprice);
		
		//Print current page URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Page URL: "+currentUrl);
		
		driver.close();		
		
	}

}
