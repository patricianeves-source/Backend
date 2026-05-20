import java.util.Scanner;

public class cardapiodalanchonete {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("-----MENU-----");
        IO.println("1- X-Burguer R$15" +
                "\n2- X-Salada R$18" +
                "\n3- Refregerante R$7" +
                "\n4- Batata Frita R$12");

        IO.println("Informe o código do produto");

        int produto = sc.nextInt();

        switch (produto){

            case 1:
                IO.println("X-Burguer - R$15");
                break;

            case 2:
                IO.println("X-Salada - R$18");
                break;

            case 3:
                IO.println("Refrigerante - R$7");
                break;

            case 4:
                IO.println("Batata Frita - R$12");
                break;
        }

    }
}
