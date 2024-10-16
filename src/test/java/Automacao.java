
public class Automacao
{
    public static void main(String[] args)
    {
        ControleAutomacao braco = new ControleAutomacao();
        braco.abrirnavegador();
        braco.esperar(4000);
        braco.fecharnavegador();
    }
}
