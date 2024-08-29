package FKM;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;
import Generic_Utility.tryAtFail;

public class Cashback_History extends Base_class {
@Test(retryAnalyzer = tryAtFail.class)
public void cb_history() throws InterruptedException{
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='₹']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='₹']"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()='Cashback History'])[1]"))).click();
 
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Confirmed']"))).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Declined']"))).click();

	}
}
