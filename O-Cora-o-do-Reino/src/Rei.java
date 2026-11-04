public class Rei extends Personagem{

    public Rei() {
        super("Rei", "Espero que não, mas o poder do cristal desperta ambição até nas pessoas mais leais.");
    }

    @Override
    public String getPerguntaEspecifica() {
        return "Quem sabia onde o cristal era guardado?";
    }

    @Override
    public String responderPerguntaEspecifica() {
        return "Poucas pessoas. Eu, o capitão e alguns funcionários autorizados.";
    }
}
