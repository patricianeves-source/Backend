import java.util.Scanner;

public class somadenumerospares {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite um numero");

        int numero = sc.nextInt();

        int soma = 0;

        int i = 1;

        while (i <= numero) {

            if (i % 2 == 0) {

                soma += i;

            }

            i++;


        }

        IO.println(" A soma dos números pares até" + numero + "é :" + soma);

    }
}
