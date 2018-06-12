import java.util.Scanner;

public class parouimpar {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA QUE VERIFICA SE O NUMERO É PAR OU IMPAR");
        System.out.print("DIGITE O NUMERO DESEJADO :");
        int numero = scanner.nextInt();

        // Qualquer numero divisível por 2 é um numero par.
        if(numero % 2 == 0)
            System.out.println("O NUMERO " + numero + " É UM NUMERO PAR");

        // Aos demais numeros o resultado sera um numero impar.
        else
            System.out.println("O NUMERO " + numero + " É UM NUMERO IMPAR");




    }








}
