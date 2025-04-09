package datePicker;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PickDateDemo {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeTest
    public static void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Initialize WebDriverWait
    }

    @Test
    public static void selectDate() {
        driver.get("https://www.makemytrip.com");

        // Close the modal if it appears
        try {
            WebElement closeButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='commonModal__close']")));
            closeButton.click();
        } catch (Exception e) {
            System.out.println("No modal to close.");
        }

        // Click on Departure Date field
        WebElement Depart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@for='departure']")));
        Depart.click();

        // Loop to find the desired month (May 2025)
        //while (true) {
            WebElement currentMonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayPicker-Caption']/div")));
            if (currentMonth.getText().contains("May 2025")) {
               // break; // Exit loop when the desired month is found
            } else {
                // Click Next button to navigate to next month
                WebElement nextButton = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
                nextButton.click();
            }
       // }

        // Select the specific date (e.g., 7th May 2025)
        List<WebElement> dateList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='dateInnerCell']/p")));

        for (WebElement date : dateList) {
            if (date.getText().equals("7")) {
                date.click();
                break; // Exit loop after selecting the date
            }
        }

        System.out.println("Selected Date: May 7, 2025");
    }
}
