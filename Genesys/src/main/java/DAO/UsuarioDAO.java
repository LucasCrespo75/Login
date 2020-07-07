package DAO;

	import java.util.List;
	import entidade.Usuario;

	public interface UsuarioDAO {
		
		
		public void inserir(Usuario usuario);
		
		public void remover(Usuario usuario);
		
		public void pesquisar(double id_cpf);
		
		public List<Usuario> listaUsuario();

	}
	


