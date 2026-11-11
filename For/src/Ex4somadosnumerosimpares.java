import java.util.Scanner;

public class Ex4somadosnumerosimpares {
    static void main() {

                int soma = 0;

                for (int i = 1; i <= 20; i++) {

                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
                System.out.println("A soma dos ímpares de 1 a 20 é: " + soma);
            }
        }









