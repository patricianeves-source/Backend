public class Personagem {
    private static final int VIDA_MAXIMA = 100;
    private static final int ENERGIA_MAXIMA = 100;
    private static final int CUSTO_ATAQUE = 20;
    private static final int RECUPERACAO_DESCANSO = 30;

    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = VIDA_MAXIMA;
        this.energia = ENERGIA_MAXIMA;
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean estaDerrotado() {
        return vida == 0;
    }

    public void receberDano(int dano) {
        if (dano < 0) {
            System.out.println("O dano não pode ser negativo.");
            return;
        }
        vida = Math.max(0, vida - dano);
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
        if (estaDerrotado()) {
            System.out.println(nome + " foi derrotado!");
        }
    }

    public void descansar() {
        if (estaDerrotado()) {
            System.out.println(nome + " está derrotado e não pode descansar.");
            return;
        }
        energia = Math.min(ENERGIA_MAXIMA, energia + RECUPERACAO_DESCANSO);
        System.out.println(nome + " descansou. Energia atual: " + energia);
    }

    public boolean atacar() {
        if (estaDerrotado()) {
            System.out.println(nome + " está derrotado e não pode atacar.");
            return false;
        }
        if (energia < CUSTO_ATAQUE) {
            System.out.println(nome + " não tem energia suficiente para atacar.");
            return false;
        }
        energia -= CUSTO_ATAQUE;
        System.out.println(nome + " atacou! Energia atual: " + energia);
        return true;
    }

    public String getStatus() {
        return estaDerrotado() ? "Derrotado" : "Vivo";
    }

    @Override
    public String toString() {
        return nome + " | Nível: " + nivel + " | Vida: " + vida
                + " | Energia: " + energia + " | Status: " + getStatus();
    }
}