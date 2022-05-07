package CountTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountTest {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		By current_population = By.xpath("//div[@class='maincounter-number']//span[@rel='current_population']");

		By Today_data_thisyear_data = By
				.xpath("//div[text()='This year' or text()='Today']//parent::div//div[@class='sec-counter']");

		int count = 1;
		while (count <= 20) {
			if (count >= 20)
				break;
			System.out.println("Current population");
			getdata(current_population);

			System.out.println("-----------------------------------------------");

			System.out.println("Current year and Today's data statstics");
			getdata(Today_data_thisyear_data);

			Thread.sleep(1000);
			count++;
		}

	}

	public static void getdata(By Locator) throws InterruptedException {

		List<WebElement> current_pop = driver.findElements(Locator);

		for (WebElement e : current_pop) {
			System.out.println(e.getText());
		}

	}

}