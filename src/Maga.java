public class Maga extends Personagem{

    public Maga() {
        super("Maga Real", "Talvez alguém que acreditasse estar salvando o reino. Às vezes as pessoas fazem escolhas difíceis.");
    }

    @Override
    public String getPerguntaEspecifica() {
        return "Você conhece o poder do cristal?";
    }

    @Override
    public String responderPerguntaEspecifica() {
        return "Conheço melhor do que qualquer um, ele mantém o equilíbrio do reino.";
    }
}
