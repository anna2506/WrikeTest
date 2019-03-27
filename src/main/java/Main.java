import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
  public static void click(WebElement element, WebDriver driver){
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
  }
  public static void main(String [] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://wrike.com");
    String urlStart = driver.getCurrentUrl();
    WebElement element = ((ChromeDriver) driver).findElementByClassName("wg-btn--green");
    click(element, driver);
    RandomGenerator randomGenerator = new RandomGenerator();
    String email = randomGenerator.generateRandom(10)+"+wpt@wriketask.qaa";
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__input");
    element.sendKeys(email);
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__submit");
    click(element, driver);
    assert driver.getCurrentUrl() != urlStart;

  }
}
