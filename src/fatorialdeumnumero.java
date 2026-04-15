import java.util.Scanner;

public class fatorialdeumnumero {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite o número para calcular");

        int numero = sc.nextInt();

        int fatorial = 1;
        int contador = numero;

        while (contador > 1){

            fatorial *= contador;

            contador--;
        }
        IO.println(numero + "! = " + fatorial);

    }
}
