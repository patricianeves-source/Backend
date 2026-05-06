import java.util.Scanner;

public class Ex10 {
    static void main() {
        IO.println("Me fale suas 5 notas");

        Scanner sc = new Scanner(System.in);
        int media = 0;

        for (int i = 1; i <= 5; i++){
            int nota = sc.nextInt();

            media = media + nota;

        }

        IO.println("sua media é "+media/5  );

    }
}
