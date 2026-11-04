public class Local implements Investigavel {

    private String nome;
    private String pista;

    public Local(String nome, String pista) {
        this.nome = nome;
        this.pista = pista;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String investigar() {
        return pista;
    }
}
