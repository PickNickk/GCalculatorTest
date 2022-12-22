import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baze {
    private WebDriver driver;
    private Actions actions;
    @BeforeClass
    public void setUp (){
        driver = new ChromeDriver();

        actions = new Actions(driver);

        driver.get("https://www.google.com/search?q=calculator");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Actions getActions() {
        return actions;
    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
