import java.util.Scanner;

public class Jogo {

        private Scanner scanner;
        private Jogador jogador;
        private Rei rei;
        private Guarda guarda;
        private Bibliotecaria bibliotecaria;
        private Cozinheira cozinheira;
        private Maga maga;
        private boolean bibliotecaInvestigada;

        public Jogo() {
            this.scanner = new Scanner(System.in);
            this.rei = new Rei();
            this.guarda = new Guarda();
            this.bibliotecaria = new Bibliotecaria();
            this.cozinheira = new Cozinheira();
            this.maga = new Maga();
            this.bibliotecaInvestigada = false;
        }

        public void iniciar() {
            System.out.println("=== O Coração do Reino ===");
            System.out.print("Digite o nome do seu detetive: ");
            String nomeJogador = scanner.nextLine();
            jogador = new Jogador(nomeJogador);

            System.out.println("\nVocê foi contratado pela coroa para descobrir quem roubou o cristal mágico do reino.");
            System.out.println("Sem ele, o reino está entrando em decadência.");
            System.out.println("Converse com as pessoas do palácio, reúna as pistas e descubra quem roubou o cristal.\n");

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

                opcao = Integer.parseInt(scanner.nextLine());

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
            System.out.println("\nEscolha com quem você quer conversar:");
            System.out.println("1 - Rei");
            System.out.println("2 - Guarda");
            System.out.println("3 - Bibliotecária");
            System.out.println("4 - Cozinheira");
            System.out.println("5 - Maga Real");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int escolha = Integer.parseInt(scanner.nextLine());
            Personagem personagem = null;

            switch (escolha) {
                case 1:
                    personagem = rei;
                    break;
                case 2:
                    personagem = guarda;
                    break;
                case 3:
                    personagem = bibliotecaria;
                    break;
                case 4:
                    personagem = cozinheira;
                    break;
                case 5:
                    personagem = maga;
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            conversarCom(personagem);
        }

        private void conversarCom(Personagem personagem) {
            System.out.println("\nVocê está conversando com " + personagem.getNome() + ".");
            System.out.println("1 - Você sabe de alguém que teria algum motivo para roubar o cristal?");
            System.out.println("2 - " + personagem.getPerguntaEspecifica());
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1 || opcao == 2) {
                jogador.investigar(personagem, opcao);
            }
        }

        private void investigarCastelo() {
            if (!bibliotecaInvestigada) {
                System.out.println("\nVocê investiga a biblioteca e encontra o livro das passagens secretas.");
                System.out.println("Ao inspecioná-lo, você encontra o mapa das passagens secretas do castelo.");
                System.out.println("Um dos caminhos está marcado em direção à Torre Leste.");
                jogador.getInventario().adicionarPista("O mapa das passagens secretas mostra um caminho até a Torre Leste.");
                bibliotecaInvestigada = true;
            } else {
                System.out.println("\nVocê já investigou a biblioteca. Não há mais nada de novo por aqui.");
            }
        }

        private void acusar() {
            System.out.println("\nDepois de reunir as provas, está na hora de acusar alguém.");
            System.out.println("Quem roubou o coração do reino?");
            System.out.println("1 - Rei");
            System.out.println("2 - Guarda");
            System.out.println("3 - Bibliotecária");
            System.out.println("4 - Cozinheira");
            System.out.println("5 - Maga Real");
            System.out.print("Escolha: ");

            int escolha = Integer.parseInt(scanner.nextLine());

            if (escolha == 5) {
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
    }







