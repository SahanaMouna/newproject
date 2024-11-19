package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basics {
	ChromeDriver driver; //when the funcn is common 
	@BeforeMethod
	public void start() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test                          //Annotation
	public void methodOne() {
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("link1")).click();
		}
	@Test
	public void methodTwo() {
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
	}
	@AfterMethod
	public void end() {
		driver.quit();
	}
}
