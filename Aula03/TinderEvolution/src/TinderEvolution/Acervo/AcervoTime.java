package TinderEvolution.Acervo;

import TinderEvolution.Dominio.Time;

import java.util.ArrayList;
import java.util.List;

public class AcervoTime {
    private static int contador = 1;
    private static final List<Time> times = new ArrayList<>();

    public Time salvar(Time time) {
        time.setId(contador++);
        times.add(time);
        return time;
    }

    public List<Time> listar() {
        return times;
    }

    public Time procurar(int id) {

        for (Time time : times) {
            if (time.getId() == id) {
                return time;
            }
        }

        return null;

    }

    public boolean deletar(int id) {

        Time timeParaDeletar = procurar(id);
        if (timeParaDeletar != null) {
            return times.remove(timeParaDeletar);
        }

        return false;

    }

    public Time editar(Time timeParaEditar, Time timeAtualizado) {

        timeParaEditar.setNome(timeAtualizado.getNome());

        return timeParaEditar;
    }
}
