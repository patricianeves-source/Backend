import java.util.Scanner;

public class Niveldeacesso {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Digite o seu código de usuário");
        IO.println("\nA) Administrador" +
                "\nB) Funcionário" +
                "\nC) Cliente");

        String codigo = sc.nextLine();

        switch (codigo){

            case "A":
                IO.println("Acesso Total");
                break;

            case "B":
                IO.println("Acesso administrativo restrito");
                break;

            case "C":
                IO.println("Acesso restrito");
                break;
        }
    }
}
