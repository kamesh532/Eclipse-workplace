package com.shadow;

import java.time.Duration;

import org.apache.poi.ss.formula.functions.Today;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
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
		Cookie cook=new Cookie.Builder("Kamesh", "Password").domain("http//doodle.com").build();
		driver.get("https://www.google.co.in");
		driver.manage().addCookie(cook);
		Cookie getCook= driver.manage().getCookieNamed("Kamesh");
	}
	@Test
	public static void getShadow() {
		WebElement txt= driver.findElement(By.xpath("//*[@jsname='gLFyf']"));//getShadowRoot().findElement(By.cssSelector(".smart-menu-item-label-element")).click();
		System.out.println(txt.getText());
		Cookie cook=new Cookie.Builder("Kamesh", "Password").domain("http.doodle.com").build();
		driver.manage().addCookie(cook);
		Cookie getCook= driver.manage().getCookieNamed("cook");
		System.out.println("Cookie : "+getCook);
	}
	

}
