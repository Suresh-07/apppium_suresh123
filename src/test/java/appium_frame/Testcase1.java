package appium_frame;


	import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
	import static io.appium.java_client.touch.offset.ElementOption.element;
	import static java.time.Duration.ofSeconds;
	import java.io.IOException;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

    import Framework.Capabilities;
    import io.appium.java_client.MobileBy;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.touch.offset.PointOption;
	public class Testcase1  extends Capabilities {
		
		@BeforeTest
		public void KillAllProcesses() throws IOException, InterruptedException {
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Thread.sleep(8000);
			
		}
		@Test
		public void tc1() throws IOException, InterruptedException {
			Thread.sleep(3000);
			service = startServer();
			AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
			
			Thread.sleep(10000);
			
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click(); 
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"))").click();
			driver.findElementByAndroidUIAutomator("text(\"Enter name here\")").sendKeys("suresh");
			 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			//addcart    android.widget.CheckBox
			 Thread.sleep(2000);
			 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).click();
			 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			 Thread.sleep(3000);
			 driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
			 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
			 Thread.sleep(5000);
			 driver.quit();

		}
}