public abstract class Personagem implements Investigavel {

    private String nome;
    private String respostaComum;

    public Personagem(String nome, String respostaComum) {
        this.nome = nome;
        this.respostaComum = respostaComum;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public String getRespostaComum() {
        return respostaComum;
    }

    @Override
    public String investigar() {
        return responderPerguntaEspecifica();
    }

    public abstract String getPerguntaEspecifica();

    public abstract String responderPerguntaEspecifica();
}