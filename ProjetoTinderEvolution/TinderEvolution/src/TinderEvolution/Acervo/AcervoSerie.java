package TinderEvolution.Acervo;

import java.util.ArrayList;
import java.util.List;

import TinderEvolution.Dominio.Serie;

public class AcervoSerie {
    private static int contador = 1;
    private static final List<Serie> series = new ArrayList<>();

    public Serie salvar(Serie serie) {
        serie.setId(contador++);
        series.add(serie);
        return serie;
    }

    public List<Serie> listar() {
        return series;
    }

    public Serie procurar(int id) {

        for (Serie serie : series) {
            if (serie.getId() == id) {
                return serie;
            }
        }

        return null;

    }

    public boolean deletar(int id) {

        Serie serieParaDeletar = procurar(id);
        if (serieParaDeletar != null) {
            return series.remove(serieParaDeletar);
        }

        return false;

    }

    public Serie editar(Serie serieParaEditar, Serie serieAtualizada) {

        serieParaEditar.setNome(serieAtualizada.getNome());
        serieParaEditar.setSinopse(serieAtualizada.getSinopse());
        serieParaEditar.setDiretor(serieAtualizada.getDiretor());
        serieParaEditar.setLancamento(serieAtualizada.getLancamento());
        serieParaEditar.setGenero(serieAtualizada.getGenero());
        serieParaEditar.setNumeroTemporadas(serieAtualizada.getNumeroTemporadas());
        serieParaEditar.setNumeroEpisodios(serieAtualizada.getNumeroEpisodios());

        return serieParaEditar;

    }
}
