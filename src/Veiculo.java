public class Veiculo {

    public String cor;
    public String marca;

    public String modelo;


    public String acelarar() {

        return "vruuuuuuuuummmmmmm";

    }
    public String freiar(){

        return "iriiiiiii";

    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public Veiculo(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;


    }
}
