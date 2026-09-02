import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<pet> pets = new ArrayList<>();

        pets.add(new GatoLaser("Mia", 80, "vermelho"));
        pets.add(new GatoVoador("Tom", 90, 15));
        pets.add(new ararabrisa("Arabrisa", 100, 50));

        for (pet pet : pets) {
            pet.identificar();
            pet.brincar();
            System.out.println("---");

        }
    }
}