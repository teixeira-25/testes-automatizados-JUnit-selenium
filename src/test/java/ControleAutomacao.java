import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControleAutomacao
{

    WebDriver driver = new ChromeDriver();

    public void abrirnavegador()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com.br/");
    }
    public void fecharnavegador()
    {
        driver.close();
    }
    public void esperar(int temp)
    {
        try {
            Thread.sleep(temp);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
