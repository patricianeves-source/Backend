public class Guarda extends Personagem {

    public Guarda() {
        super("Guarda", "Quem conhece o castelo por dentro teria vantagem. Alguém de fora dificilmente conseguiria entrar.");
    }

    @Override
    public String getPerguntaEspecifica() {
        return "Você viu alguém naquela noite?";
    }

    @Override
    public String responderPerguntaEspecifica() {
        return "Vi uma sombra de capa escura perto da Torre Leste, mas desapareceu antes que eu chegasse.";
    }
}

