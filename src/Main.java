public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Aragorn");

        System.out.println("=== Estado inicial ===");
        System.out.println(heroi);

        System.out.println("\n=== Teste: ataques consomem energia ===");
        heroi.atacar();
        heroi.atacar();

        System.out.println("\n=== Teste: sem energia suficiente não ataca ===");
        heroi.atacar();
        heroi.atacar();
        heroi.atacar(); // energia chega a 0
        heroi.atacar(); // deve falhar
        System.out.println(heroi);

        System.out.println("\n=== Teste: descansar recupera energia ===");
        heroi.descansar();
        heroi.atacar();

        System.out.println("\n=== Teste: energia não ultrapassa 100 ===");
        heroi.descansar();
        heroi.descansar();
        heroi.descansar();
        heroi.descansar();
        heroi.descansar();
        System.out.println(heroi);

        System.out.println("\n=== Teste: receber dano diminui a vida ===");
        heroi.receberDano(30);
        System.out.println(heroi);

        System.out.println("\n=== Teste: dano negativo é ignorado ===");
        heroi.receberDano(-10);
        System.out.println(heroi);

        System.out.println("\n=== Teste: vida não fica abaixo de 0 ===");
        heroi.receberDano(500);
        System.out.println(heroi);

        System.out.println("\n=== Teste: derrotado não ataca nem descansa ===");
        heroi.atacar();
        heroi.descansar();

        System.out.println("\n=== Status final ===");
        System.out.println(heroi.getNome() + ": " + heroi.getStatus());
    }
}