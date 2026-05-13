import java.util.Scanner;

public class Ex1while {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite sua senha");

        int senha = sc.nextInt();

        do {
            IO.println("Senha incorreta! Tente novamente.....");
            senha = sc.nextInt();

        } while (senha != 1234) ;
            IO.println("Senha correta! Celular desbloqueado");



    }
}
