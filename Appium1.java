package appiumtests;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Appium1{
static RemoteWebDriver driver;

		public static void appium() throws MalformedURLException, InterruptedException {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("appium:deviceName", "HUAWEI Y7 Prime 2018");
			cap.setCapability("appium:udid", "26EBB18B10155241");
			cap.setCapability("appium:platformName", "Android");
			cap.setCapability("appium:platformVersion", "8.0.0");
			cap.setCapability("appium:APPIUM_VERSION", "1.22.1");
			cap.setCapability("appium:appPackage", "com.android.calculator2");
			cap.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
			cap.setCapability("appium:automationName", "appium");
//			cap.setCapability("appium:app","/data/app/com.google.android.calculator-m3zXi-yruW3b_CbCW-m7Cg==/base.apk");
//			cap.setCapability("appium:appPackage","com.android.vending");
			cap.setCapability("noReset","true");
			cap.setCapability("ignoreHiddenApiPolicyError", true);
			
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

			System.out.println("app start");
			driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
			driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
			driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();
			driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		}

		public static void main(String[] args) throws InterruptedException, MalformedURLException {

			Appium1.appium();

		}
	}



