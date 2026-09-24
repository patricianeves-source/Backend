import java.util.ArrayList;
import java.util.List;

public class Inventário {

    private List<String> pistas;

    public Inventário() {
        this.pistas = new ArrayList<>();
    }

    public void adicionarPista(String pista) {
        pistas.add(pista);
    }

    public void mostrarPistas() {
        if (pistas.isEmpty()) {
            System.out.println("O Caderno do Detetive ainda não tem nenhuma pista.");
        } else {
            System.out.println("=== Caderno do Detetive ===");
            for (String pista : pistas) {
                System.out.println("- " + pista);
            }
        }
    }
}



