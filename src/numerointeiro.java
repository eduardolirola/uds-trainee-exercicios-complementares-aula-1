import java.awt.font.NumericShaper;
import java.util.Scanner;

public class numerointeiro {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ESTE PROGRAMA VERIFICA SE O NUMERO É OU NÃO INTEIRO");
        System.out.print("DIGITE O NUMERO DESEJADO: ");
        float numero = scanner.nextFloat();



        // Qualquer numero divisível por 2 é um numero par.
        if(numero == (int) numero)
            System.out.println("O NUMERO " + numero + " É UM NUMERO INTEIRO");

            // Aos demais numeros o resultado sera um numero impar.
        else
            System.out.println("O NUMERO " + numero + " NÃO É UM NUMERO INTEIRO!");

    }
}
