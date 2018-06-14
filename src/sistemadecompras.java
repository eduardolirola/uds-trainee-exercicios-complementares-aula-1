import java.util.Scanner;

public class sistemadecompras {

    public static void main(String[] args) {


        double saldo = 1500;
        double total = 0;

        System.out.println("Olá seu saldo atual é de R$ " + saldo );
        System.out.println("escolha sua opção de compra: ");


        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] GABINETES");
        System.out.println("[2] ROTEADORES");
        System.out.println("[3] PLACAS");
        System.out.println("[4] MONITORES");
        System.out.println("[5] ACESSORIOS");
        System.out.print("OPÇÃO : ");

        int opcao1 = scanner.nextInt();

        switch (opcao1) {

            case 1:
                System.out.println("GABINETES DISPONÍVEIS EM ESTOQUE :");
                System.out.println("[1] GABINETE 2 BAIAS CENTRIUM: R$ 100,00");
                System.out.println("[2] GABINETE 2 BAIAS MULTILASER : R$ 150,00");
                System.out.println("[3] GABINETE NVIDIA VERDE : R$ 200,00");
                System.out.println("[4] GABINETE NVIDIA VERMELHO : R$ 500,00");
                System.out.println("[5] GABINETE LEDS : R$ 600,00");
                System.out.print("OPÇÃO :");
                opcao1 = scanner.nextInt();

                switch (opcao1){
                    case 1:
                        total = saldo - 100.00;
                        break;

                    case 2:
                        total = saldo - 150.00;
                        break;
                    case 3:
                        total = saldo - 200.00;
                        break;
                    case 4:
                        total = saldo - 500.00;
                        break;
                    case 5:
                        total = saldo - 600.00;
                        break;

                }
            case 2:
                System.out.println("ROTEADORES DISPONÍVEIS EM ESTOQUE :");
                System.out.println("[1] ROTEADOR TP-LINK 150mbps: R$ 100,00");
                System.out.println("[2] ROTEADOR D-LINK 150mbps: R$ 150,00");
                System.out.println("[3] ROTEADOR TP-LINK 350mbps: R$ 180,00");
                System.out.println("[4] ROTEADOR D-LINK 350mbps: R$ 190,00");
                System.out.println("[5] ROTEADOR TP-LINK 3 ANTENAS : R$ 240,00");
                System.out.print("OPÇÃO :");
                opcao1 = scanner.nextInt();

                switch (opcao1) {
                    case 1:
                        total = saldo - 100.00;
                        break;

                    case 2:
                        total = saldo - 150.00;
                        break;
                    case 3:
                        total = saldo - 180.00;
                        break;
                    case 4:
                        total = saldo - 190.00;
                        break;
                    case 5:
                        total = saldo - 240.00;
                        break;

                }

            case 3:
                System.out.println("PLACAS DISPONÍVEIS EM ESTOQUE :");
                System.out.println("[1] PLACA USB WIRELLES: R$ 100,00");
                System.out.println("[2] PLACA DE REDE GB: R$ 70,00");
                System.out.println("[3] PLACA MAE GIGABITE I5: R$ 350,00");
                System.out.println("[4] PLACA MAE ASUS I5: R$ 420,00");
                System.out.println("[5] PLACA MAE ASUS I7: R$ 570,00");
                System.out.print("OPÇÃO :");
                opcao1 = scanner.nextInt();

                switch (opcao1) {
                    case 1:
                        total = saldo - 100.00;
                        break;

                    case 2:
                        total = saldo - 70.00;
                        break;
                    case 3:
                        total = saldo - 350.00;
                        break;
                    case 4:
                        total = saldo - 420.00;
                        break;
                    case 5:
                        total = saldo - 570.00;
                        break;

                }

            case 4:
                System.out.println("MONITORES DISPONÍVEIS EM ESTOQUE :");
                System.out.println("[1] MONITOR LED AOC 15': R$ 200,00");
                System.out.println("[2] MONITOR LED AOC 17': R$ 250,00");
                System.out.println("[3] MONITOR LED AOC 22: R$ 350,00");
                System.out.println("[4] MONITOR SAMSUNG CURVA 22': R$ 720,00");
                System.out.println("[5] MONITOR SAMSUNG CURVA 29': R$ 850,00");
                System.out.print("OPÇÃO :");
                opcao1 = scanner.nextInt();

                switch (opcao1) {
                    case 1:
                        total = saldo - 200.00;
                        break;

                    case 2:
                        total = saldo - 250.00;
                        break;
                    case 3:
                        total = saldo - 350.00;
                        break;
                    case 4:
                        total = saldo - 720.00;
                        break;
                    case 5:
                        total = saldo - 850.00;
                        break;

                }

            case 5:
                System.out.println("ACESSORIOS DISPONÍVEIS EM ESTOQUE :");
                System.out.println("[1] MOUSE MULTILASER: R$ 25,00");
                System.out.println("[2] MOUSE MICROSSOFT: R$ 140,00");
                System.out.println("[3] TECLADO MICROSSOFT: R$ 189,00");
                System.out.println("[4] CAIXA DE SOM HOME : R$ 200,00");
                System.out.println("[5] FONE SONY: R$ 150,00");
                System.out.print("OPÇÃO :");
                opcao1 = scanner.nextInt();

                switch (opcao1) {
                    case 1:
                        total = saldo - 25.00;
                        break;

                    case 2:
                        total = saldo - 140.00;
                        break;
                    case 3:
                        total = saldo - 189.00;
                        break;
                    case 4:
                        total = saldo - 200.00;
                        break;
                    case 5:
                        total = saldo - 150.00;
                        break;

                }



                    System.out.println("SEU SALDO ATUAL É : R$" + total);


        }
    }


}







