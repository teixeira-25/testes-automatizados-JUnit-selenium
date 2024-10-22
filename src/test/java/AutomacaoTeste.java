import Pages.PageGoogle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AutomacaoTeste extends Hooks
{
    @Test
    @DisplayName("Cenario senha e email correto")
    public void tet() throws InterruptedException
    {
        PageGoogle braco = new PageGoogle();
        braco.abrirsite("http://bug.dev.hill/signin");
        braco.maximizar();
        braco.clicarEescrever1("email","teixeirinha@local.dev");
        braco.clicarEescrever1("pass","qwe123");
        braco.clicar("login");
        braco.esperar(3000);
        braco.fecharnavegador();
    }
    @Test
    @DisplayName("Cenario senha incorreta e email correto")
    public void tet2() throws InterruptedException
    {
        PageGoogle braco = new PageGoogle();
        braco.abrirsite("http://bug.dev.hill/signin");
        braco.maximizar();
        braco.clicarEescrever1("email","teixeirinha@local.dev");
        braco.clicarEescrever1("pass","tplink");
        braco.clicar("login");
        braco.esperar(3000);
        braco.fecharnavegador();
    }
    @Test
    @DisplayName("Cenario senha correta e email incorreto")
    public void tet3() throws InterruptedException
    {
        PageGoogle braco = new PageGoogle();
        braco.abrirsite("http://bug.dev.hill/signin");
        braco.maximizar();
        braco.clicarEescrever1("email","gabrielcavalcanteteixeira@gmail.com");
        braco.clicarEescrever1("pass","qwe123");
        braco.clicar("login");
        braco.esperar(3000);
        braco.fecharnavegador();
    }
}
