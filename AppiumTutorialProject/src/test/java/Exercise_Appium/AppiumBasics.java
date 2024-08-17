package Exercise_Appium;

import java.net.*;
import java.time.Duration;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumBasics {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;

	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		// create capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Kevin");
		options.setApp(
				"C:\\Users\\kevin\\eclipse-workspace\\AppiumTutorialProject\\src\\test\\java\\resources\\IDB 1.0.1.apk");

		// create object for android driver
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Quit the driver
		driver.quit();
	}
}
