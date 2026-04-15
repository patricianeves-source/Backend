import java.util.Scanner;

public class somadenumeros {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite um número inteiro: ");

        int n = sc.nextInt();

        int soma = 0;
        int contador = 1;


        while (contador <= n) {

            soma += contador;


if (contador <n){

    IO.print(contador + "+");


}else {

    IO.println(contador + "=" + soma);


}


            contador++;

}





        }


    }









