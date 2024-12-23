package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		//Select by Index
		WebElement drop1 = driver.findElement(By.id("Dropdown-1"));
		Select dd= new Select(drop1);
		dd.selectByIndex(5);
		
		//Select by Value
		WebElement drop2 = driver.findElement(By.id("Dropdown-2"));
		Select product = new Select(drop2);
		product.selectByValue("UI for WinForms");
		
		//Select by Text
		WebElement drop3 = driver.findElement(By.id("Country-1"));
		Select country = new Select(drop3);
		country.selectByVisibleText("India");
		
		}
	
	}
