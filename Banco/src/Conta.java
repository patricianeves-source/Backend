import java.util.StringJoiner;

public abstract class Conta {

    private String numero;
    private String agencia;
    private String titular;
    private double saldo;

    private void depositar(double valor) {
        saldo += valor;

    }

    private void sacar(double valor) {
        if (valor >= saldo) {
            valor -= saldo;
        } else {
            IO.println("Sem saldo");


        }

    }

    private void exibirSaldo() {
        IO.println(saldo);
    }
    public abstract double calcularTarifaMensal();
}


