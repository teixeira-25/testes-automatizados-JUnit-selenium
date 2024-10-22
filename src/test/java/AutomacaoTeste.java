import Pages.PageGoogle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AutomacaoTeste
{
    @Test
    public void tet() throws InterruptedException
    {
        PageGoogle braco = new PageGoogle();
        braco.abrirnavegador();
        braco.maximizar();
        braco.clicarEescrever1("APjFqb","A igreja de jesus cristo");
        braco.clicar3("gNO89b");
        braco.clicar2("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div[1]/span");
        braco.esperar(1000);
        braco.clicar("truste-consent-button");
        braco.esperar(3000);
        braco.fecharnavegador();
    }
}
