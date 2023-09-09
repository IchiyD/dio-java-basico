public class AparelhoTelefonico {
    boolean ligando = false;

    public void ligar(){
        ligando = true;
    }

    public void atender(){
        System.out.println("Atender");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz...");
    }
}