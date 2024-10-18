import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks
{
    public static WebDriver driver;
    public static ChromeOptions options;

    @BeforeAll
    public static void abrir()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");
    }
    @AfterAll
    public static void fechar()
    {
        driver.quit();
    }
}
