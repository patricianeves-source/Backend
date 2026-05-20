import java.util.Scanner;

public class Caixaeletronico {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("-----MENU-----" +
                "\n1- Consultar Saldo" +
                "\n2- Sacar Dinheiro" +
                "\n3- Depositar Dinheiro" +
                "\n4- Sair");

        int opcoes = sc.nextInt();
        switch (opcoes) {

            case 1:
                IO.println("Seu saldo;" +
                        "\nR$1918,00");
                break;

            case 2:
                IO.println("Quanto você quer sacar?");
                int sacar = sc.nextInt();
                IO.println("Você sacou R$"+ sacar);
                break;

            case 3:
                IO.println("Quanto você quer Depositar?");
                int depositar = sc.nextInt();
                IO.println("Você depositou R$"+ depositar);
                break;

            case 4:
                IO.println("-----Sair-----" +
                        "\nVocê tem certeza que quer sair do Banco Virtual?");
                String opcao = sc.nextLine();
                IO.println("Você saiu do Banco Virtual");
                break;
        }
    }
}
