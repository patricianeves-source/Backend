public abstract class pet { protected String nome;
    protected int felicidade;

    public pet(String nome, int felicidade) {
        this.nome = nome;
        this.felicidade = felicidade;
    }

    public void identificar() {
        System.out.println("Nome: " + nome + " | Felicidade: " + felicidade);
    }

    public abstract void brincar();
}


