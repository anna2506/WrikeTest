import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WrikeTest {
  RandomGenerator randomGenerator = new RandomGenerator();
  public static void sleep(){
    try {
      Thread.sleep(1000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public WrikeTest()
  {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
  }
  @Link(description = "Trying to connect to a Wrike website")
  public void connection(WebDriver driver)
  {
    driver.get("http://wrike.com");

  }
  @Test(description = "Doing all the tasks")
  @Description("Trying to find all the necessary information")
  public void firstTask(WebDriver driver)
  {

  }
  @Test(description = "Checking if the button clicked")
  @Description("Contains assertion checking")
  public void secondTask(WebDriver driver, WebElement element, String urlStart)
  {

    String email = randomGenerator.generateRandomString(10)+"+wpt@wriketask.qaa";
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__input");
    element.sendKeys(email);
    element = ((ChromeDriver) driver).findElementByClassName("modal-form-trial__submit");
    element.click();
    while (driver.getCurrentUrl().equals(urlStart)){sleep();}
    Assert.assertFalse((driver.getCurrentUrl().equals(urlStart)));

  }
  @Description("Filling the Q&A section")
  public void thirdTask(WebElement element, WebDriver driver)
  {
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
  }
  @Description("Re-sending an email")
  @Test(description = "Contains an assertion error")
  public void fourthTask(WebElement element, WebDriver driver)
  {
    element = ((ChromeDriver) driver).findElementByClassName("js-survey-submit");
    element.click();
    while(((ChromeDriver) driver).findElementByClassName("survey").isDisplayed()){sleep();}
    Assert.assertFalse(((ChromeDriver) driver).findElementByClassName("survey").isDisplayed());
    element = ((ChromeDriver) driver).findElementByClassName("js-button");
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    Assert.assertFalse(((ChromeDriver) driver).findElementByClassName("again").isDisplayed());
  }
  @Test(description = "Trying to find a Twitter icon on a web page")
  @Description("Checking if the link is correct")
  public void twitter(WebDriver driver)
  {
    try{
      ((ChromeDriver) driver).findElementByCssSelector("body > div.wg-layout.wg-layout--outline > div > div.wg-footer__bottom-section > div > div.wg-footer__social-block > div > ul > li:nth-child(1) > a").isDisplayed();
      System.out.println("There is Twitter icon");
      HttpURLConnection huc = (HttpURLConnection)(new URL("https://twitter.com/wrike").openConnection());
      huc.setRequestMethod("HEAD");
      huc.connect();
      int respCode = huc.getResponseCode();
      if(respCode >= 400){
        System.out.println("Twitter is a broken link");
      }
      else{
        System.out.println("Twitter is a valid link");
      }
    }
    catch (NoSuchElementException e) {
      System.out.println("Something went wrong");
    }
    catch (MalformedURLException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    driver.quit();
  }
}
