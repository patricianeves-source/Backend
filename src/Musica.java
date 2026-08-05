public class Musica {

    public String nome;

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", duracao='" + duracao + '\'' +
                ", artista='" + artista + '\'' +
                ", voume=" + voume +
                '}';
    }

    public String duracao;
    public String artista;
    public int voume;

    public Musica (String nome, String duracao, String artista, int volume){

        this.nome = nome;
        this.duracao=duracao;
        this.artista=artista;
        this.voume=volume;
    }
}
