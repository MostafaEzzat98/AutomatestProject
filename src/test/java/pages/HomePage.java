package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    private final By headerLogo = By.xpath("(//a[@class='header_logoHorizontal__KABN4 header_logoText__d_X6V header_logoImg__85jCX'])[2]");



    public HomePage (WebDriver driver){
        this.driver=driver;
    }

    public WebElement logo(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(headerLogo));
        return driver.findElement(headerLogo);
    }

}
