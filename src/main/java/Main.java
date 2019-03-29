import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
  public static void sleep(){
    try {
      Thread.sleep(1000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public static void main(String [] args) {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://wrike.com");
    String urlStart = driver.getCurrentUrl();
    WebElement element = ((ChromeDriver) driver).findElementByClassName("wg-btn--green");
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    RandomGenerator randomGenerator = new RandomGenerator();
    String email = randomGenerator.generateRandomString(10)+"+wpt@wriketask.qaa";
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__input");
    element.sendKeys(email);
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__submit");
    element.click();
    while (driver.getCurrentUrl().equals(urlStart)){sleep();}
    Assert.assertFalse((driver.getCurrentUrl().equals(urlStart)));
    int variant = randomGenerator.generateRandomInt(1, 2);
    switch (variant)
    {
      case(1):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(6) > label:nth-child(1) > button");
        break;
      case (2):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(6) > label:nth-child(2) > button");
        break;
    }
    element.click();
    variant = randomGenerator.generateRandomInt(1, 5);
    switch (variant)
    {
      case(1):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(8) > label:nth-child(1) > button");
        break;
      case (2):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(8) > label:nth-child(2) > button");
        break;
      case (3):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(8) > label:nth-child(3) > button");
        break;
      case (4):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(8) > label:nth-child(4) > button");
        break;
      case (5):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(8) > label:nth-child(5) > button");
        break;
    }
    element.click();
    variant = randomGenerator.generateRandomInt(1, 3);
    switch (variant)
    {
      case(1):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(10) > label:nth-child(1) > button");
        element.click();
        break;
      case (2):
        element = ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(10) > label:nth-child(2) > button");
        element.click();
        break;
      case (3):
        element = ((ChromeDriver) driver).findElementByClassName("switch--fullwidth");
        element.click();
        String answer = randomGenerator.generateRandomString(5);
        element = ((ChromeDriver) driver).findElementByCssSelector("input[placeholder='Your comment']");
        element.sendKeys(answer);
        break;
    }
    element = ((ChromeDriver) driver).findElementByClassName("js-survey-submit");
    element.click();
    while(((ChromeDriver) driver).findElementByClassName("survey").isDisplayed()){sleep();}
    Assert.assertFalse(((ChromeDriver) driver).findElementByClassName("survey").isDisplayed());
    element = ((ChromeDriver) driver).findElementByClassName("js-button");
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    Assert.assertFalse(((ChromeDriver) driver).findElementByClassName("again").isDisplayed());
  }
}
