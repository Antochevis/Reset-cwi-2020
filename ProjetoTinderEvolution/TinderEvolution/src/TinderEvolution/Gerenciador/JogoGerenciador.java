package TinderEvolution.Gerenciador;

import java.time.LocalDate;
import java.util.List;

import TinderEvolution.Acervo.AcervoJogo;
import TinderEvolution.Dominio.Jogo;

public class JogoGerenciador {

    private AcervoJogo acervo = new AcervoJogo();

    public Jogo salvar(Jogo jogo) {

        List<Jogo> jogos = acervo.listar();

        for (Jogo jogoExistente : jogos) {
            if (jogo.getNome().equals(jogoExistente.getNome()) && jogo.getPlataforma() == jogoExistente.getPlataforma()) {
                return jogoExistente;
            }
        }

        if (jogo.getNome().isEmpty() || jogo.getGenero() == null || jogo.getPlataforma() == null || jogo.getLancamento() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        if (jogo.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(jogo);
    }

    public Jogo editar(int id, Jogo jogoAtualizado) {

        Jogo jogoParaEditar = procurar(id);

        if (jogoParaEditar == null) {
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAtualizado);
        }
    }

    public List<Jogo> listar() {
        return acervo.listar();
    }

    public Jogo procurar(int id) {

        if (id > 0) {
            return acervo.procurar(id);
        }

        return null;

    }

    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }

        return false;
    }
}
