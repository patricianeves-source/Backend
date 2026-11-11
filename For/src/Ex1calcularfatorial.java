import java.util.Scanner;

public class Ex1calcularfatorial {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("-----Digite um número-----");
        int aleatorio = sc.nextInt();

        int guardar = 1;


        for (int i = 1; i <= aleatorio; i++) {

        guardar=guardar*i;
        }

        IO.println(guardar);
    }
}
