//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Veiculo ferrari = new Veiculo("vermelho", "ferrari", "SF90");

    IO.println(ferrari);

    Veiculo carro = new Veiculo("creme", "fusca", "Volkswagen Fusca");

    Veiculo tink = new Veiculo("Esmeralda", "motors", "Tink X1");

    IO.println(ferrari + " " + ferrari.acelarar());

}
