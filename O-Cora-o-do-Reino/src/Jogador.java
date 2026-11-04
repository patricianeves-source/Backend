public class Jogador {

    private String nome;
    private Inventario inventario;

    public Jogador(String nome) {
        this.nome = nome;
        this.inventario = new Inventario();
    }

    public String getNome() {
        return nome;
    }

    public Inventario getInventario() {
        return inventario;
    }

    // Polimorfismo + interface: investiga uma pessoa OU um local
    public void investigar(Investigavel alvo) {
        String resultado = alvo.investigar();
        System.out.println("\n[" + alvo.getNome() + "] " + resultado);
        inventario.adicionarPista(resultado);
    }

    public void perguntarRumor(Personagem personagem) {
        String rumor = personagem.getRespostaComum();
        System.out.println("\n" + personagem.getNome() + ": " + rumor);
        inventario.adicionarPista(rumor);
    }
}
