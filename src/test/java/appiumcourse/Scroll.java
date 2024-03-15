package appiumcourse;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;

public class Scroll extends BaseTest {

	@Test
	public void ScrollTest() throws URISyntaxException, MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//scroll if target element is know prior
		/*driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));*/
		
		
		//scroll if no idea if element exists or not, keeps scrolling until is not possible to scroll anymore
		scrollToEndAction();
		
	}
}
