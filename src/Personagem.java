public abstract class Personagem {


        private String nome;
        private String respostaComum;

        public Personagem(String nome, String respostaComum) {
            this.nome = nome;
            this.respostaComum = respostaComum;
        }

        public String getNome() {
            return nome;
        }

        public String getRespostaComum() {
            return respostaComum;
        }

        public abstract String getPerguntaEspecifica();

        public abstract String responderPerguntaEspecifica();
    }
