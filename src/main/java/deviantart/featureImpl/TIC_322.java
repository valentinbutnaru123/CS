package deviantart.featureImpl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TIC_322 {
    private WebDriver driver;

    @Given("Launch Chrome browser TIC_322")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("Open loving-hermann.com page TIC_322")
    public void open_loving_hermann_com_login_page() {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html#");
    }

    @Then("Open clothing menu TIC_322")
    public void open_clothing_menu() {
        WebElement menWearButton = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
        menWearButton.click();
        WebElement clothingButton = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/ul/div/div[2]/ul/li/a"));
        clothingButton.click();
    }

    @And("Press on \"ADD TO CARD\" button multiple times")
    public void press_on_ADD_TO_CARD_button_multiple_times() {
        WebElement frstProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[2]/div[2]/form/fieldset/input[10]"));
        frstProductButton.click();
        WebElement scndProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[2]/div/div[2]/div[2]/form/fieldset/input[10]"));
        scndProductButton.click();
        WebElement thrdProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[3]/div/div[2]/div[2]/form/fieldset/input[10]"));
        thrdProductButton.click();
        WebElement ffthProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[4]/div/div[2]/div[2]/form/fieldset/input[10]"));
        ffthProductButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Close the browser TIC_322")
    public void close_the_browser() {
        driver.close();
    }
}
