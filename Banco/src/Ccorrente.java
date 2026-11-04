public class Ccorrente extends Conta {

    public class ContaCorrente extends Conta {

        private static final double TARIFA_FIXA = 12.00;

        @Override
        public double calcularTarifaMensal() {
            return TARIFA_FIXA;
        }
    }


    }

