package TinderEvolution.Gerenciador;

import java.time.LocalDate;
import java.util.List;

import TinderEvolution.Acervo.AcervoSerie;
import TinderEvolution.Dominio.Serie;

public class SerieGerenciador {
    private AcervoSerie acervo = new AcervoSerie();

    public Serie salvar(Serie serie) {

        List<Serie> series = acervo.listar();

        for (Serie serieExistente : series) {
            if (serie.getNome().equals(serieExistente.getNome())) {
                return serieExistente;
            }
        }

        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getSinopse().isEmpty() || serie.getGenero() == null || serie.getLancamento() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        if (serie.getNumeroTemporadas() < 1 && serie.getNumeroEpisodios() < serie.getNumeroTemporadas()) {
            System.out.println("O número de episódios ou temporadas não é válido.");
            return null;
        }

        if (serie.getLancamento().isAfter(LocalDate.now())) {
            return null;
        }

        return acervo.salvar(serie);
    }

    public Serie editar(int id, Serie serieAtualizada) {

        Serie serieParaEditar = procurar(id);

        if (serieParaEditar == null) {
            return null;
        } else {
            return acervo.editar(serieParaEditar, serieAtualizada);
        }
    }

    public List<Serie> listar() {
        return acervo.listar();
    }

    public Serie procurar(int id) {

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
