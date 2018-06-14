import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class numeropositivoounegativo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA PARA VERIFICAR SE SEU NUMERO É POSITIVO OU NEGATIVO");
        System.out.print("POR FAVOR DIGITE O NUMERO DESEJADO: ");
        int numero = scanner.nextInt();

        if (numero >= 0)
            System.out.println("O NUMERO " + numero + " É UM NUMERO POSITIVO");
        else
            System.out.println("O NUMERO " + numero + " É UM NUMERO NEGATIVO");
    }

}
