public class ararabrisa extends pet {private int forcaDoVento;

    public ararabrisa(String nome, int felicidade, int forcaDoVento) {
        super(nome, felicidade);
        this.forcaDoVento = forcaDoVento;
    }

    @Override
    public void brincar() {
        System.out.println(nome + " bate as asas de felicidade e gera um vento de força " + forcaDoVento + "!");
    }
}


