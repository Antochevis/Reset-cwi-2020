package TinderEvolution.Gerenciador;

import TinderEvolution.Acervo.AcervoTime;
import TinderEvolution.Dominio.Time;

import java.util.List;

public class TimeGerenciador {


    private AcervoTime acervo = new AcervoTime();

    public Time salvar(Time time) {

        List<Time> times = acervo.listar();

        for (Time timeExistente : times) {
            if (time.getNome().equals(timeExistente.getNome())) {
                return timeExistente;
            }
        }

        if (time.getNome().isEmpty()) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        return acervo.salvar(time);
    }

    public Time editar(int id, Time timeAtualizado) {

        Time timeParaEditar = procurar(id);

        if (timeParaEditar == null) {
            return null;
        } else {
            return acervo.editar(timeParaEditar, timeAtualizado);
        }
    }

    public List<Time> listar() {
        return acervo.listar();
    }

    public Time procurar(int id) {

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
