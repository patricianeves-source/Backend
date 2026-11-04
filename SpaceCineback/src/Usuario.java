import java.time.LocalDate;
import java.util.Date;

public class Usuario {

     private String nome;
     private String cpf;
     private Genero genero;
     private String nomesocial;
     private LocalDate datadenasc;
     private String email;
     private String cep;
     private String senha;
     private String telefone;

     public Usuario(String nome, String cpf, Genero genero, String nomesocial, LocalDate datadenasc, String email, String cep, String senha, String telefone) {

     }


     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;

     }

     public String getCpf() {
          return cpf;

     }

     public void setCpf(String cpf) {
          this.cpf = cpf;

     }

     public Genero getGenero() {
          return genero;
     }

     public String getNomesocial() {
          return nomesocial;

     }

     public void setNomesocial(String nomesocial) {
          this.nomesocial = nomesocial;


     }

     public LocalDate getDatadenasc() {
          return datadenasc;

     }

     public void setDatadenasc(LocalDate datadenasc) {
          this.datadenasc = datadenasc;

     }

     public String getEmail() {
          return email;

     }

     public void setEmail(String email) {
          this.email = email;

     }

     public String getCep() {
          return cep;

     }

     public String getSenha() {
          return senha;


     }

     public String getTelefone() {
          return telefone;

 git gi    }

     public void setTelefone(String telefone) {
          this.telefone = telefone;
     }
}