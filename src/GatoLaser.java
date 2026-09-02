public class GatoLaser extends pet {  private String corDoLaser;

    public GatoLaser(String nome, int felicidade, String corDoLaser) {
        super(nome, felicidade);
        this.corDoLaser = corDoLaser;
    }

    @Override
    public void brincar() {
        System.out.println(nome + " brinca e dispara um laser " + corDoLaser + " dos olhos!");
    }
}










