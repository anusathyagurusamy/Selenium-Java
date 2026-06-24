package BasicSeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPgm {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();

        // Click date field (calendar)
      driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[1]/div[3]/div[1]")).click();

        String targetMonthYear = "Aug 2026";
        String targetDate = "15";

        while (true) {

            // Get current month + year
            String currentMonthYear = driver.findElement(
                By.xpath("//div[contains(@class,'DayNavigator__CalendarHeader')]")
            ).getText();

            if (currentMonthYear.contains(targetMonthYear)) {
                break;
            }

            // Click next button
            driver.findElement(
                By.xpath("//button[contains(@class,'DayNavigator__IconBlock')]")
            ).click();

            Thread.sleep(1000);
        }

        // Select date
        driver.findElement(
            By.xpath("//span[text()='" + targetDate + "']")
        ).click();

        driver.quit();
    }
}