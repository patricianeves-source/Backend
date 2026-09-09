public abstract class Colaborador {

    private String nome;
    private String cpf;
    private String matricula;

    protected Colaborador(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    public abstract double calcularRemuneracao();

    public void exibirInformacoes() {
        System.out.printf("Nome: %s | CPF: %s | Matrícula: %s | Remuneração: R$ %.2f%n",
                nome, cpf, matricula, calcularRemuneracao());
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getMatricula() {
        return matricula;
    }

    public abstract void acessarSistema();
}

