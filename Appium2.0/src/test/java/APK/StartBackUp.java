package APK;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class StartBackUp {
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities dcap = new DesiredCapabilities();
	dcap.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
	dcap.setCapability("platformName", "Android");
	dcap.setCapability("platformVersion", "9");
	dcap.setCapability("automationName", "uiautomator2");
//	dcap.setCapability("app", "C:\\Users\\Dell\\Downloads\\ApiDemos-debug.apk");
//	dcap.setCapability("appPackage", "com.freekaamaalindia");
//	dcap.setCapability("appActivity", "com.freekaamaalindia.MainActivity");
	dcap.setCapability("appPackage", "io.appium.android.apis");
	dcap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	URL url =URI.create("http://127.0.0.1:4723").toURL();
	AndroidDriver driver = new AndroidDriver(url,dcap);
	
	
	
}
}
