import java.util.Scanner;

public class Ex2lernumeros {
    static void main() {

        Scanner sc = new Scanner(System.in);


        IO.println("quantos numeros você deseja digitar");

        int aleatorio = sc.nextInt();

        if (aleatorio <= 0){

            IO.println("O número deve ser maior que zero");


        }
        IO.println("Digite um número ");

        int maior = aleatorio;

        int menor = aleatorio;

        for (int i = 2; i <= aleatorio; i++){


            aleatorio = sc.nextInt();

            if (aleatorio > maior) {

                maior = aleatorio;
            } else if (aleatorio < menor) {
                menor=aleatorio;

            }
            IO.println("=======================");
            IO.println("Maior número " + maior);
            IO.println("Menor número " + menor);
            sc.close();
        }
        }
    }

