package com.shadow;

import java.time.Duration;

import org.apache.poi.ss.formula.functions.Today;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetShadow {
	public static WebDriver driver;
	@BeforeMethod
	public static void setUp() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		Cookie cook=new Cookie.Builder("Kamesh", "Password").domain("http//doodle.com").build();
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
//		driver.manage().addCookie(cook);
//		Cookie getCook= driver.manage().getCookieNamed("Kamesh");
	}
	@Test
	public static void getShadow() {
		WebElement shadowHost=driver.findElement(By.xpath("//*[@class='smart-ui-component']"));
//		SearchContext con= shadowHost.getShadowRoot();
//		con.findElement(By.cssSelector("smart-menu-item-label-element")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement element=	(WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('.smart-menu-item-label-element');", shadowHost);
	element.click();
	}
	

}
