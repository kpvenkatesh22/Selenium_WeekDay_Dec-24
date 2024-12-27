package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.pvrcinemas.com/");
		
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//span[@id='city']/input")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//ul[@id='city_list']/li")).click();
		
		driver.findElement(By.xpath("//div[@id='movie']/span")).click();
		driver.findElement(By.xpath("(//span[text()='MAX'])[2]")).click();
		
		//driver.findElement(By.xpath("//div[@id='date']/span")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina Mall, OMR, Chennai')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'06:25 PM')]")).click();
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn']/span")).click();
		
		
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		
		driver.findElement(By.xpath("//span[@id='CL.CLUB|G:10']")).click();
		driver.findElement(By.xpath("//span[@id='CL.CLUB|G:9']")).click();
		driver.findElement(By.xpath("//span[@id='CL.CLUB|G:8']")).click();
		
		String seat = driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
		System.out.println("Slected Seats are: "+ seat);
		
		String total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("Grand Total is: "+total);
		
		driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		driver.findElement(By.xpath("//div[@class='register-btn col-md-3']/button")).click();
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String tile= driver.getTitle();
		System.out.println("Title of the page is: "+tile);
		
		driver.close();
		
		
	}

}
