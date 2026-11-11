public class contadordepares {

    static void main() {

        int contador = 0;

        IO.println("--- Números pares de 0 a 50 ---");

        while (contador <= 50){

            if (contador % 2 == 0){

                IO.println(contador);

            }

            contador++;

        }



    }




}
