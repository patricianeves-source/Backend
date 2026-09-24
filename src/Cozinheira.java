public class Cozinheira extends Personagem{

    public Cozinheira() {
        super("Cozinheira", "Não sei quem seria, mas quem disse aquilo parecia realmente acreditar no que estava fazendo.");
    }

    @Override
    public String getPerguntaEspecifica() {
        return "O que você ouviu naquela noite?";
    }

    @Override
    public String responderPerguntaEspecifica() {
        return "Houve uma discussão. Uma frase ficou na minha cabeça: 'O reino não merece esse poder.'";
    }
}
