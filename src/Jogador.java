public class Jogador {

    private String nome;
    private Inventário inventario;

    public Jogador(String nome) {
        this.nome = nome;
        this.inventario = new Inventário();
    }

    public String getNome() {
        return nome;
    }

    public Inventário getInventario() {
        return inventario;
    }

    public void investigar(Personagem personagem, int opcao) {
        if (opcao == 1) {
            System.out.println(personagem.getNome() + ": " + personagem.getRespostaComum());
            inventario.adicionarPista(personagem.getRespostaComum());
        } else if (opcao == 2) {
            System.out.println(personagem.getPerguntaEspecifica());
            System.out.println(personagem.getNome() + ": " + personagem.responderPerguntaEspecifica());
            inventario.adicionarPista(personagem.responderPerguntaEspecifica());
        }
    }
}

