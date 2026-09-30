import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {

    private Scanner scanner;
    private Jogador jogador;
    private Castelo castelo;
    private Personagem culpado;

    public Jogo() {
        this.scanner = new Scanner(System.in);

        Maga maga = new Maga();
        List<Personagem> funcionarios = new ArrayList<>();
        funcionarios.add(new Rei());
        funcionarios.add(new Guarda());
        funcionarios.add(new Bibliotecaria());
        funcionarios.add(new Cozinheira());
        funcionarios.add(maga);

        this.castelo = new Castelo(funcionarios);
        this.culpado = maga;
    }

    public void iniciar() {
        System.out.println("=== O Coração do Reino ===");
        System.out.print("Digite o nome do seu detetive: ");
        String nomeJogador = scanner.nextLine();
        jogador = new Jogador(nomeJogador);

        System.out.println("\nVocê foi contratado pela coroa para descobrir quem roubou o cristal mágico do reino.");
        System.out.println("Sem ele, o reino está entrando em decadência.");
        System.out.println("Converse com as pessoas do palácio, investigue o castelo e descubra quem roubou o cristal.\n");

        menuPrincipal();
    }

    private void menuPrincipal() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- O que deseja fazer? ---");
            System.out.println("1 - Conversar com alguém do palácio");
            System.out.println("2 - Investigar o castelo");
            System.out.println("3 - Abrir o Caderno do Detetive");
            System.out.println("4 - Acusar alguém");
            System.out.println("0 - Sair do jogo");
            System.out.print("Escolha: ");

            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    menuConversar();
                    break;
                case 2:
                    investigarCastelo();
                    break;
                case 3:
                    jogador.getInventario().mostrarPistas();
                    break;
                case 4:
                    acusar();
                    return;
                case 0:
                    System.out.println("Você encerrou a investigação.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void menuConversar() {
        List<Personagem> funcionarios = castelo.getFuncionarios();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha com quem você quer conversar:");
            for (int i = 0; i < funcionarios.size(); i++) {
                System.out.println((i + 1) + " - " + funcionarios.get(i).getNome());
            }
            System.out.println("0 - Voltar ao início");
            System.out.print("Escolha: ");

            int escolha = lerOpcao();

            if (escolha == 0) {
                return;
            }
            if (escolha < 1 || escolha > funcionarios.size()) {
                System.out.println("Opção inválida.");
            } else {
                // true = jogador quer falar com outro funcionário
                continuar = conversarCom(funcionarios.get(escolha - 1));
            }
        }
    }

    private boolean conversarCom(Personagem personagem) {
        System.out.println("\nVocê está conversando com " + personagem.getNome() + ".");

        while (true) {
            System.out.println("\n1 - Você sabe de alguém que teria algum motivo para roubar o cristal?");
            System.out.println("2 - " + personagem.getPerguntaEspecifica());
            System.out.println("3 - Conversar com outro funcionário");
            System.out.println("0 - Encerrar conversa e voltar ao início");
            System.out.print("Escolha: ");

            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    jogador.perguntarRumor(personagem);
                    break;
                case 2:
                    jogador.investigar(personagem);
                    break;
                case 3:
                    System.out.println("Você se despede de " + personagem.getNome() + ".");
                    return true;
                case 0:
                    System.out.println("Você se despede de " + personagem.getNome() + ".");
                    return false;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    private void investigarCastelo() {
        List<Local> locais = castelo.getLocais();

        System.out.println("\nOnde você quer investigar?");
        for (int i = 0; i < locais.size(); i++) {
            System.out.println((i + 1) + " - " + locais.get(i).getNome());
        }
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");

        int escolha = lerOpcao();
        if (escolha == 0) {
            return;
        }
        if (escolha < 1 || escolha > locais.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        jogador.investigar(locais.get(escolha - 1));
    }

    private void acusar() {
        List<Personagem> funcionarios = castelo.getFuncionarios();

        System.out.println("\nDepois de reunir as provas, está na hora de acusar alguém.");
        System.out.println("Quem roubou o coração do reino?");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println((i + 1) + " - " + funcionarios.get(i).getNome());
        }
        System.out.print("Escolha: ");

        int escolha = lerOpcao();
        if (escolha < 1 || escolha > funcionarios.size()) {
            System.out.println("\nVocê hesitou e perdeu a chance de acusar. Fim de jogo.");
            return;
        }

        Personagem acusado = funcionarios.get(escolha - 1);

        if (acusado == culpado) {
            System.out.println("\nA Maga Real admite o roubo e revela onde escondeu o cristal.");
            System.out.println("\"Eu roubei o cristal e o escondi na passagem secreta da Torre Leste.");
            System.out.println("Eu acreditava que estava protegendo o reino.\"");
            System.out.println("\nO cristal é recuperado. Você venceu!");
        } else {
            System.out.println("\nA acusação estava errada.");
            System.out.println("O verdadeiro culpado continua livre e o coração do reino permanece escondido.");
            System.out.println("Fim de jogo.");
        }
    }

    // Evita que o jogo quebre se o jogador digitar uma letra
    private int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}


