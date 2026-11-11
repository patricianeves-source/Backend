import java.util.Scanner;

public class Ex3somadosdigitos {
    static void main() {
                java.util.Scanner sc  = new Scanner(System.in);

                System.out.print("Digite um número inteiro: ");

                int numero = sc.nextInt();

                int soma = 0;
                int n = numero;


                if (n < 0) {
                    n = -n;
                }


                for (; n != 0; n /= 10) {
                    soma += n % 10;
                }

                System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
            }
        }



