import java.util.Scanner;

public class Ex07 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite a tabuada que você que ver");

        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            IO.println(num + "x" + i  +"="+ num*i);
        }
        }
    }

