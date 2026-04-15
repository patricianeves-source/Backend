void main () {

    Scanner sc = new Scanner(System.in);

    int numerosecreto = 7;
    int aleatorio = 0;

    IO.println("----- Jogo do Número Secreto -----");

    while (aleatorio != numerosecreto){

        IO.println("----- Descubra o numero secreto -----");

        aleatorio = sc.nextInt();

        if (aleatorio == numerosecreto){

            IO.println("Parabéns! Você acertou.");



        } else if (aleatorio < numerosecreto) {

            IO.println("Baixo demais...... Tenta denovo");

        }else{
            IO.println("Vixe, muito alto.. tenta denovo");
        }
    }










}



