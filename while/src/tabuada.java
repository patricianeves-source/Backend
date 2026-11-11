 void main() {

     Scanner sc = new Scanner(System.in);

     IO.println("Digite o numero para a tabuada");

     int numero = sc.nextInt();

     int contador = 1;

     IO.println("tabuada do" + numero + ":");

     while (contador <= 10) {

         int resultado = numero * contador;

         IO.println(numero + " x " + contador + "=" + resultado);

         contador++;


     }




 }

