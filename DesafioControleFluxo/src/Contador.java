import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
          try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite o primeiro parâmetro: ");
              int num1 = leia.nextInt();
              System.out.print("Digite o segundo parâmetro: ");
              int num2 = leia.nextInt();

              try{
                contar(num1, num2); 
              }catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
              }
        }
    }

        static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = num2 - num1;
            for(int numeros = 1; numeros <= contagem; numeros++){
                System.out.println("Números: " + numeros);
            }
        }
    }
}
