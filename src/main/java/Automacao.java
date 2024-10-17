import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Automacao extends ControleAutomacao
{
    public static void main(String[] args)
    {
        ControleAutomacao braco = new ControleAutomacao();
        braco.abrirnavegador();
        braco.maximizar();
        braco.clicarEescrever1("APjFqb","A igreja de jesus cristo");
        braco.clicar3("gNO89b");
        braco.clicar2("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div[1]/span");
        braco.esperar(1000);
        braco.clicar("truste-consent-button");
        braco.esperar(4000);
        braco.fecharnavegador();
    }
}
