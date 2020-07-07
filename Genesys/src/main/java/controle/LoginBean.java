package controle;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import DAO.UsuarioDAOIMPL;
import entidade.Usuario;

@ManagedBean(name = "LoginBean")
@SessionScoped

public class LoginBean {
		
		private double id_cpf;
		private String nome_usuario;
		private String senha_usuario;
		
		private List<Usuario> listaUsuario;
		private Usuario usuario;
		private String msgCadastroUsuario;
		
		private UsuarioDAOIMPL usuarioDAO;

		public LoginBean() {
			this.listaUsuario = new ArrayList<Usuario>();
			this.usuario = new Usuario();
			this.usuarioDAO = new UsuarioDAOIMPL();
		}
		
		public String entrar() {
			
		
			Usuario usuarioDentro = null;
			
			this.listaUsuario = this.usuarioDAO.listaUsuario();
			
			for(Usuario usuarioPesquisa : listaUsuario) {
				
			if(usuarioPesquisa.getNome_usuario().equals(this.nome_usuario) && getSenha_usuario().equals(this.id_cpf));
			
			usuarioDentro = usuarioPesquisa;
			}
		

		if (usuarioDentro != null) {
			return "calculadora.xhtml";
			
		} else {
			return "index.xhtml";
		}
}

		public void cadastroUsuario() {
			
			Usuario novo = new Usuario();
			
			novo.setNome_usuario(this.usuario.getNome_usuario());
			novo.setSenha_usuario(this.usuario.getSenha_usuario());
			novo.setId_cpf(this.usuario.getId_cpf());
			
			boolean achou = false;
			
			this.listaUsuario = this.usuarioDAO.listaUsuario();
			for(Usuario usuarioPesquisa : listaUsuario) {
				if(usuarioPesquisa.getId_cpf()==this.id_cpf){
					achou = true;
				}
			}
			if(achou) {
				FacesContext.getCurrentInstance()
				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Usuario já existe!!!"));
			}else {
				//inserir um novo partindo da interface do q foi pedido la(inserir)
				//n precisa da listaUsuario porq ela foi validada em cima
				this.usuarioDAO.inserir(novo);
				
				//poderia sim, colocar essa instancia la em cima, 
				//mas para ficar organizado, pode colocar aqui(mas é necessario p/ limpar no cadastro para um NOVO)
				this.usuario = new Usuario();
				
			}
		}
		

		public double getId_cpf() {
			return id_cpf;
		}

		public void setId_cpf(double id_cpf) {
			this.id_cpf = id_cpf;
		}

		public String getNome_usuario() {
			return nome_usuario;
		}

		public void setNome_usuario(String nome_usuario) {
			this.nome_usuario = nome_usuario;
		}

		public String getSenha_usuario() {
			return senha_usuario;
		}

		public void setSenha_usuario(String senha_usuario) {
			this.senha_usuario = senha_usuario;
		}
		public List<Usuario> getListaUsuario() {
			return listaUsuario;
		}
		public void setListaUsuario(List<Usuario> listaUsuario) {
			this.listaUsuario = listaUsuario;
		}

		public Usuario getUsuario() {
			return usuario;
		}
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		public String getMsgCadastroUsuario() {
			return msgCadastroUsuario;
		}
		public void setMsgCadastroUsuario(String msgCadastroUsuario) {
			this.msgCadastroUsuario = msgCadastroUsuario;
		}
		public UsuarioDAOIMPL getUsuarioDAO() {
			return usuarioDAO;
		}
		public void setUsuarioDAO(UsuarioDAOIMPL usuarioDAO) {
			this.usuarioDAO = usuarioDAO;
		}

		
}
