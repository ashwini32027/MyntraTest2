package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	WebDriver driver;
    WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement waitForVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForClick(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForAllVisible(List<WebElement> elements) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
}
