public class NavegadorInternet {
    //boolean exibindoPag = false;
    int aba = 1;

    public void exibirPag(){
      //  exibindoPag = true;
      System.out.println("Exibindo página...");
    }

    public void adicionarNovaAba(int novaAba){
        aba = aba + 1;
        System.out.println("Nova aba");
    }

    public void atualizarPag(){
        System.out.print("Atualizando Página...");
    }
}