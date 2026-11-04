public class GatoVoador extends pet {private int alturaMaxima;

    public GatoVoador(String nome, int felicidade, int alturaMaxima) {
        super(nome, felicidade);
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void brincar() {
        System.out.println(nome + " ronrona de felicidade e sai voando até " + alturaMaxima + " metros de altura!");
    }
}


