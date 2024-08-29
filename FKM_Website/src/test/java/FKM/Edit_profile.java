package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class Edit_profile extends Base_class {
	@Test
	public void profile() throws InterruptedException {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='header_profile_image']"))).click();
		driver.findElement(By.id("fullname")).clear();
		driver.findElement(By.id("fullname")).sendKeys("Tester");
		String name = driver.findElement(By.id("fullname")).getText();
		System.out.println("nvbn");
		WebElement save = driver.findElement(By.xpath("//button[text()='Save Changes']"));
		Actions act = new Actions(driver);
		act.moveToElement(save).perform();
		wait.until(ExpectedConditions.elementToBeClickable(save)).click();
		Thread.sleep(500);
		
		//validation
//		String name = driver.findElement(By.id("fullname")).getText();
//		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
//		String textMessege = driver.findElement(By.xpath("//span[text()='Your profile has been successfully updated. Thanks for keeping it current!']")).getText();
//		System.out.println(textMessege);
//		String status="Your profile has been successfully updated. Thanks for keeping it current!";
//	
//		if(textMessege.equalsIgnoreCase(status)) {
//			System.out.println("It is verified! Name has been Changed");
//		}
//		else {
//			System.out.println("Alas! Name is Not Changed");
//		}
		
		
	}
}
