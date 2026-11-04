public class Bibliotecaria extends Personagem{

    public Bibliotecaria() {
        super("Bibliotecária", "Algumas pessoas acreditam que o cristal dá poder demais ao rei. Já ouvi esse tipo de conversa.");
    }

    @Override
    public String getPerguntaEspecifica() {
        return "Você encontrou algo suspeito?";
    }

    @Override
    public String responderPerguntaEspecifica() {
        return "Um livro sobre passagens secretas foi retirado da estante e devolvido às pressas.";
    }
}

