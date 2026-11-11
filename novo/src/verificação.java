import java.util.Scanner;

public class verificação {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num  != 0){

            if (num % 2 == 0) {

                IO.println("o numero é par");

            }else {

                IO.println("o numero é ímpar");

            }
            num = sc.nextInt();

        }
    }
}
