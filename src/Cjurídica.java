public class Cjurídica extends Conta {
    public class ContaPessoaJuridica extends Conta {

        private static final double TARIFA_FIXA = 20.00;

        @Override
        public double calcularTarifaMensal() {
            return TARIFA_FIXA;
        }
    }
}
