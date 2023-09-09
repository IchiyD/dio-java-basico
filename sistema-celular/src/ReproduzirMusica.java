public class ReproduzirMusica{
    boolean tocando, ligando = false;
    int musica = 1;

    public void tocarMusica(){
        tocando = true;
    }

    public void pausarMusica(){
        tocando = false;
        System.out.println("Música Pausada");
    }
    
    public void selecionarMusica(int novaMusica){
        musica = novaMusica;
    }
}
