public class SistemaIphone {
    public static void main (String[] args){
        
        ReproduzirMusica reproduzirMusica = new ReproduzirMusica();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();

        //SISTEMA MÚSICA
        reproduzirMusica.tocarMusica();
        System.out.println("Tocando Música: " + reproduzirMusica.tocando);
        reproduzirMusica.pausarMusica();
        System.out.println("Tocando Música: " + reproduzirMusica.tocando);
        reproduzirMusica.selecionarMusica(2);
        System.out.println("=============================================");
        
        //SISTEMA TELEFÔNICO
        aparelhoTelefonico.ligar();
        System.out.println("Ligando...");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("=============================================");
        
        //SISTEMA INTERNET
        navegadorInternet.exibirPag();
        navegadorInternet.adicionarNovaAba(0);
        navegadorInternet.atualizarPag();
    }
}