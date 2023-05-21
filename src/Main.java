import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public int Somar(int valor1, int valor2){
        return valor1 + valor2;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        String sair = "";

        while(!sair.equals("s")){
            System.out.print("Inscreva o primeiro valor: ");
            valor1 = entrada.nextInt();
            System.out.print("Inscreva o segundo valor: ");
            valor2 = entrada.nextInt();
            valor3 += (new Main().Somar(valor1,valor2));
            System.out.println(valor3);

            System.out.print("Deseja continuar? [S/N]:");
            sair = entrada.next().toLowerCase();
        }

    }

}