import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


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
    String email = randomGenerator.generateRandomString(10)+"+wpt@wriketask.qaa";
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__input");
    element.sendKeys(email);
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__submit");
    click(element, driver);
    try {
      Thread.sleep(2500);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    Assert.assertFalse((driver.getCurrentUrl().equals(urlStart)));
    int variant = randomGenerator.generateRandomInt(1, 2);
    switch (variant)
    {
      case(1):
        element = ((ChromeDriver) driver).findElementByCssSelector("label[for=interest_in_solution_1]");
        break;
      case (2):
        element = ((ChromeDriver) driver).findElementByCssSelector("label[for=interest_in_solution_2]");
        break;
    }
    click(element, driver);
    variant = randomGenerator.generateRandomInt(1, 5);
    switch (variant)
    {
      case(1):
        element = driver.findElement(By.xpath("//button[text()='1-5']"));
        break;
      case (2):
        element = driver.findElement(By.xpath("//button[text()='6-15']"));
        break;
      case (3):
        element = driver.findElement(By.xpath("//button[text()='16-25']"));
        break;
      case (4):
        element = driver.findElement(By.xpath("//button[text()='26-50']"));
        break;
      case (5):
        element = driver.findElement(By.xpath("//button[text()='50+']"));
        break;
    }
    click(element, driver);
    element = ((ChromeDriver) driver).findElementByClassName("js-button");
    click(element, driver);
    variant = randomGenerator.generateRandomInt(1, 2);
    switch (variant)
    {
      case(1):
        element = driver.findElement(By.xpath("//button[text()='Yes']"));
        break;
      case (2):
        element = driver.findElement(By.xpath("//button[text()='No']"));
        break;
      case (3):
        element = driver.findElement(By.xpath("//button[text()='Other']"));
        break;
    }
    click(element, driver);
    try {
      Thread.sleep(1000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    Assert.assertFalse(((ChromeDriver) driver).findElementByClassName("again").isDisplayed());
  }
}
