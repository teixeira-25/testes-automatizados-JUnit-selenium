import Pages.PageGoogle;

public class Automacao extends PageGoogle
{
    public static void main(String[] args)
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
