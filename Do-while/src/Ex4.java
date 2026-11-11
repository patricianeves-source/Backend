import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número");
        int num = sc.nextInt();
        int contador = 1;




        do {
            IO.println(num + "X" + contador + " = " + num * contador);
            contador++;
        }
        while (contador <= 10);
        contador++;
    }



    }



