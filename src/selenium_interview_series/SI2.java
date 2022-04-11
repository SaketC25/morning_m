package selenium_interview_series;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SI2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saket choursiya\\Desktop\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println("status "+ driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).isDisplayed());
        Thread.sleep(2000);
        System.out.println("status "+ driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).isEnabled());
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Thread.sleep(2000);
        Select s = new Select(day);
        s.selectByValue("14");
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select f = new Select(month);
        f.selectByValue("2");
        Thread.sleep(2000);
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select y = new Select(year);
        y.selectByValue("2021");
        Thread.sleep(2000);
        WebElement Gfem = driver.findElement(By.className("_8esa"));
        Thread.sleep(2000);
        Gfem.click();
        Thread.sleep(2000);
        System.out.println("status is " +Gfem.isSelected());
        Thread.sleep(2000);
        driver.navigate().to("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQjwz7uRBhDRARIsAFqjulnravZW227nYNd9_QZ301yyE-1bKvmcPUz48KhEu4UTVgmKPnVyo24aAiRwEALw_wcB");
        Thread.sleep(3000);
        Actions a = new Actions(driver);
        WebElement Element1 = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
        Thread.sleep(2000);
        a.moveToElement(Element1).perform();
        Thread.sleep(2000);
	}

}
