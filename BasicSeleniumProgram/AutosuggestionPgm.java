package BasicSeleniumProgram;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class AutosuggestionPgm {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ✅ Correct input field
        WebElement from = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("srcinput")));

        from.sendKeys("Chennai");

        // Wait for suggestions
        List<WebElement> suggestions = wait.until(
            ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[contains(@class,'listItem')]")
            )
        );
               // Select suggestion
        for (WebElement city : suggestions) {
            if (city.getText().contains("Koyambedu,chennai")) {
                city.click();
                Thread.sleep(3000);
                break;
            }
        }

       // driver.quit();
    }
}