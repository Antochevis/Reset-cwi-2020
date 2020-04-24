package TinderEvolution.Gerenciador;

import java.util.List;

import TinderEvolution.Acervo.AcervoUsuario;
import TinderEvolution.Dominio.Usuario;

public class UsuarioGerenciador {
    private AcervoUsuario acervo = new AcervoUsuario();

    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = acervo.listar();

        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                return usuarioExistente;
            }
        }

        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getBio().isEmpty() || usuario.getDataDeNascimento() == null || usuario.getLatitude() == null || usuario.getLongitude() == null || usuario.getTelefone() == null) {
            System.out.println("Campos obrigatórios não informados.");
            return null;
        }

        return acervo.salvar(usuario);
    }

    public Usuario editar(int id, Usuario usuarioAtualizado) {

        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            return null;
        } else {
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    public List<Usuario> listar() {
        return acervo.listar();
    }

    public Usuario procurar(int id) {

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
