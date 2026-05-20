import java.util.Scanner;

public class calculadora {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite o 1 número");

        double num1 = sc.nextDouble();
        IO.println("Digite o 2 número");
        double num2 = sc.nextDouble();

        IO.println("Digite a operação matemática");
         String opcao = sc.next();
         switch (opcao){

            case "+":
                IO.println(num1+ "+" +num2+ "=" +(num1+num2));
                break;

            case "-":
                IO.println(num1+ "-" +num2+ "=" + (num1 - num2));
                break;

            case "*":
                IO.println(num1+ "*" +num2+ "=" + (num1*num2));
                break;

            case "/":
                IO.println(num1+ "/" +num2+ "=" + (num1/num2));
                break;
        }

    }
}
