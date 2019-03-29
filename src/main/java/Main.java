
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

  public static void main(String [] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    WrikeTest wrikeTest = new WrikeTest();
    wrikeTest.connection(driver);
    String urlStart = driver.getCurrentUrl();
    WebElement element = ((ChromeDriver) driver).findElementByClassName("wg-btn--green");
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    wrikeTest.firstTask(driver);
    wrikeTest.secondTask(driver, element, urlStart);
    wrikeTest.thirdTask(element, driver);
    wrikeTest.fourthTask(element, driver);
    wrikeTest.twitter(driver);
  }
}
