package appiumcourse;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest {

	@Test
	public void WifiSettingsName() throws URISyntaxException, MalformedURLException {

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();

	}
};