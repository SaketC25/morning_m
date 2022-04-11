package selenium_interview_series;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SI1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        System.out.println(driver.getPageSource());
        Thread.sleep(2000);

	}

}
