package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DAO.UsuarioDAO;
import JpaUtil.JpaUtil;
import entidade.Usuario;

public class UsuarioDAOIMPL implements UsuarioDAO {
	
	public void inserir(Usuario usuario){
		
	
	try {
		//EntityManagerFactory ent = Persistence.createEntityManagerFactory("JAVA3");
		EntityManager em = JpaUtil.getEntityManager();
		
			/*Usuario us = new Usuario(); 
		us.setInt(1, usuario.getId_cpf());
		us.setString(2, usuario.getNome_usuario());
		us.setString(3, usuario.getSenha_usuario());
		*/
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		em.close();
		//ent.close();
		
	}catch(Exception ex)  {
		ex.printStackTrace();
	
	}
	return;
	}
	
	

	public void remover(Usuario usuario) {
		return ;
	}
	
	public void pesquisar(int id_cpf) {
		return;
	}	


	public List<Usuario> listaUsuario(){
		
		String sql = "FROM USUARIO U";
		
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		
	EntityManager conexao;
	try {
		
		conexao = JpaUtil.getEntityManager();
		conexao.getTransaction().begin();
		listaUsuario = conexao.createQuery("From Usuario u").getResultList();
			
		
		/*PreparedStatement ps = conexao.prepareStatement(sql);
		
		ResultSet re = ps.executeQuery();
		
		while(re.next()) {
			
			Usuario usuario = new Usuario();
			
			usuario.setId_cpf(re.getInt("ID_CPF"));
			usuario.setNome_usuario(re.getString("nome_usuario"));
			usuario.setSenha_usuario(re.getString("Senha_usuario"));
			
			listaUsuario.add(usuario);
			
		}
			ps.close();*/
			
		}catch(Exception ex)  {
			ex.printStackTrace();
		}
		return listaUsuario;
	}
}
	
	
	

	


