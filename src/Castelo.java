
import java.util.ArrayList;
import java.util.List;

public class Castelo {

    private List<Local> locais;
    private List<Personagem> funcionarios;

    public Castelo(List<Personagem> funcionarios) {
        this.funcionarios = funcionarios;   // agregação: já existiam fora do castelo
        this.locais = new ArrayList<>();    // composição: o castelo cria seus locais
        locais.add(new Local("Biblioteca",
                "Você encontra o livro das passagens secretas e, dentro dele, um mapa com um caminho marcado até a Torre Leste."));
        locais.add(new Local("Torre Leste",
                "Você encontra a entrada da passagem secreta e, no chão, um pó brilhante, resíduo de magia."));
        locais.add(new Local("Cozinha",
                "Um bilhete rasgado diz: 'Hoje à noite, na torre.'"));
    }

    public List<Local> getLocais() {
        return locais;
    }

    public List<Personagem> getFuncionarios() {
        return funcionarios;
    }
}
