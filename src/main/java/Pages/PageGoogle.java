package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageGoogle
{

    protected WebDriver driver = new ChromeDriver();
    protected Actions actions;
    public void abrirnavegador()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com.br/");
    }
    public void abrirsite(String site)
    {
        WebDriverManager.chromedriver().setup();
        driver.get(site);
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
    public void clicarEescrever1(String id,String text)
    {
        driver.findElement(By.id(id)).click();
        driver.findElement(By.id(id)).sendKeys(text);
    }
    public void clicarEescrever2(String xpath,String text)
    {
        driver.findElement(By.xpath(xpath)).click();
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
    public void clicarEescrever3(String classname,String text)
    {
        driver.findElement(By.className(classname)).click();
        driver.findElement(By.className(classname)).sendKeys(text);
    }
    public void descerCoisaDePesquisa()
    {
        esperar(1000);
        actions.keyDown(Keys.ESCAPE).build().perform();
    }
    public void clicar(String id)
    {
        driver.findElement(By.id(id)).click();
    }
    public void clicar2(String xpath)
    {
        driver.findElement(By.xpath(xpath)).click();
    }
    public void clicar3(String classname)
    {
        driver.findElement(By.className(classname)).click();
    }
    public void maximizar()
    {
        driver.manage().window().maximize();
    }
}