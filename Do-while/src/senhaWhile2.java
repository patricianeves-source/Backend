import java.util.Scanner;

public class senhaWhile2 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite sua senha: ");

        int senha = sc.nextInt();

        do {
            IO.println("Senha incorreta! Acesso negado...");
            senha = sc.nextInt();

        } while (senha != 1234);
        IO.println("Acesso permitido!");
    }
}
