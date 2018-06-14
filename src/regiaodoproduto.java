import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class regiaodoproduto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("VOCE SABE DE QUAL REGIÃO É SEU PRATO PREFERIDO ?");
        System.out.println(" QUAL SEU PRATO PREFERIDO:");
        System.out.println("1. ARROZ CARRETEIRO ");
        System.out.println("2. BAIÃO DE DOIS ");
        System.out.println("3. ARROZ GAÚCHO ");
        System.out.println("4. CALDO DE PACU ");
        System.out.println("5. BOLO DE MACAXEIRA ");
        System.out.println("6. PÃO DE QUEIJO ");
        System.out.println("7. FEIJOADA ");
        System.out.println("8. MOQUECA ");
        System.out.println("9. VIRADO À PAULISTA");
        System.out.println("10. FRANGO COM PEQUI");
        System.out.println("11. BOBÓ DE CAMARÃO");
        System.out.print("QUAL SEU PRATO FAVORITO: ");
        int prato = scanner.nextInt();


            switch (prato) {

                case 1:
                    System.out.println("PRATO TÍPICO DA REGIÃO SUL");
                    break;
                case 2:
                    System.out.println("PRATO TÍPICO DA REGIÃO NORTE");
                    break;
                case 3:
                    System.out.println("PRATO TÍPICO DA REGIÃO LESTE");
                    break;
                case 4:
                    System.out.println("PRATO TÍPICO DA REGIÃO OESTE ");
                    break;
                case 5:
                    System.out.println("PRATO TÍPICO DA REGIÃO NORDESTE");
                    break;
                case 6:
                    System.out.println("PRATO TÍPICO DA REGIÃO NORDESTE");
                    break;
                case 7:
                    System.out.println("PRATO TÍPICO DA REGIÃO SUDESTE");
                    break;
                case 8:
                    System.out.println("PRATO TÍPICO DA REGIÃO SUDESTE");
                    break;
                case 9:
                    System.out.println("PRATO TÍPICO DA REGIÃO SUDESTE");
                    break;
                case 10:
                    System.out.println("PRATO TÍPICO DA REGIÃO CENTRO-OESTE");
                    break;
                case 11:
                    System.out.println("PRATO TÍPICO DA REGIÃO NOROESTE");
                    break;
                default:
                    System.out.println("O PRATO NUMERO" + prato + "É DE ORIGEM IMPORTADA");
                    break;






                }



    }

}
