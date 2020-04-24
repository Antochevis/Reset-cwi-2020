package TinderEvolution.Dominio;

import java.time.LocalDate;

public class Filme {

        private int id;

        private String nome;

        private String sinopse;

        private String diretor;

        private GeneroFilme genero;

        private LocalDate lancamento;

        public Filme(String nome, String sinopse, String diretor, GeneroFilme genero, LocalDate lancamento) {
            this.nome = nome;
            this.sinopse = sinopse;
            this.diretor = diretor;
            this.genero = genero;
            this.lancamento = lancamento;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSinopse() {
            return sinopse;
        }

        public void setSinopse(String sinopse) {
            this.sinopse = sinopse;
        }

        public String getDiretor() {
            return diretor;
        }

        public void setDiretor(String diretor) {
            this.diretor = diretor;
        }

        public GeneroFilme getGenero() {
            return genero;
        }

        public void setGenero(GeneroFilme categoria) {
            this.genero = genero;
        }

        public LocalDate getLancamento() {
            return lancamento;
        }

        public void setLancamento(LocalDate lancamento) {
            this.lancamento = lancamento;
        }

        @Override
        public String toString() {
            return "Filme{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", sinopse='" + sinopse + '\'' +
                    ", diretor='" + diretor + '\'' +
                    ", gênero=" + genero +
                    ", lancamento=" + lancamento +
                    '}';
        }

}
