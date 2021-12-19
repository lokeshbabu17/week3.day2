package week3.day2;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.ajio.com/");
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[1]")).click();
		Thread.sleep(2000);
		

		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
			List<WebElement> bagNameList = driver.findElements(By.className("name"));
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
			for (WebElement webElement : bagNameList) {
				String text = webElement.getText();
				System.out.println(text);
			}
		
		
		

}
}


