package CountTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ecommerceTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		WebElement header = driver
				.findElement(By.xpath("//h3[text()='Recommended For You']//parent::div[@class='sc-gsTCUz bhdLno']"));

		By prod_names = By.xpath("//div[@class='e3js0d-7 jULUCI']");

		WebElement icon = driver
				.findElement(By.xpath("(//div[contains(@class,'swiper-button-next custom-navigation')])[1]"));
		
		WebElement header1=driver.findElement(By.xpath("//h3[text()='Save big on mobiles & tablets']//parent::div[@class='sc-gsTCUz bhdLno']"));

		WebElement icon2= driver.findElement(By.xpath("(//div[contains(@class,'swiper-button-next custom-navigation')])[2]"));
		/*
		 * navigateHeadersection(header);
		 * 
		 * getProductnames(prod_names, icon);
		 */
		navigateHeadersection(header1);
		
		getProductnames(prod_names, icon2);

	}

	public static void navigateHeadersection(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void getProductnames(By Locator, WebElement element) {
		List<WebElement> items = driver.findElements(Locator);

		System.out.println(items.size());

		for (int i = 0; i < items.size(); i++) {

			System.out.println(items.get(i).getText());

			if (element.isDisplayed()) {
				element.click();
			}

		}

	}

}
