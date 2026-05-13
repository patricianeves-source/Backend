import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número: ");

        int num = sc.nextInt();
        int i = 0;

        i += num;

        do {
            IO.println("Some outro número, ou (0) para sair");
            num = sc.nextInt();
            i += num;

        } while (num != 0);
        IO.println(i);

    }
}
