package APK_Package;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;


public class Trial {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "9");
		dcap.setCapability("automationName", "uiautomator2");
		dcap.setCapability("appPackage", "io.appium.android.apis");
		dcap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		
		
		
		URL url =URI.create("http://127.0.0.1:4723").toURL();
		AndroidDriver driver = new AndroidDriver(url,dcap);

	   driver.findElements(By.id("android:id/text1")).get(11).click();
		Dimension size = driver.manage().window().getSize();
		int centreX = size.getWidth()/2;
		int centreY = size.getHeight()/2;
		
		int endX=centreX;
		double endY=centreY*0.25;
		int EndY=(int)endY;//convert to int
		
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence seq = new Sequence(finger1, 1);
		seq.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),centreX,centreY ))
		.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		.addAction(new Pause(finger1, Duration.ofMillis(200)))
		.addAction(finger1.createPointerMove(Duration.ofMillis(200), PointerInput.Origin.viewport(), endX, EndY))
		.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		




	}
}
