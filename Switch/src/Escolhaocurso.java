import java.util.Scanner;

public class Escolhaocurso {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("-----Opções de Curso-----");
        IO.println("1- Java" +
                "\n2- Banco de Dados" +
                "\n3- Desenvolvimento Web" +
                "\n4- Redes");

        IO.println("Escolha uma opção de curso");
        int curso = sc.nextInt();

        switch (curso) {
            case 1:
                IO.println("------Curso Java-----" +
                        "\nSintexe do Java" +
                        "\nConceitos de programação" +
                        "\nAplicações Seguras");
                break;

            case 2:
                IO.println("-----Banco de Dados-----" +
                        "\nFundamentos e Conceitos" +
                        "\nModelagem de Dados" +
                        "\nLinguagem SQL");
                break;

            case 3:
                IO.println("-----Desenvolvimento Web-----" +
                        "\nDesenvolvimento Frontend" +
                        "\nDesenvolvimento Backend" +
                        "\nBanco de dados);");
                break;

            case 4:
                IO.println("-----Redes-----" +
                        "\nFundamentos e Modelos de Referência" +
                        "\nEndereçamento e Protocolos" +
                        "\nInfraestrutura e Equipamentos (Hardware)");
                break;



        }
    }
}