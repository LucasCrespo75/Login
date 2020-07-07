package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @Column(name = "ID_CPF", nullable = false)
	private double id_cpf;
    
    @Column(name = "NOME_USUARIO", nullable = false)
	private String nome_usuario;
    
    @Column(name = "SENHA_USUARIO", nullable = false)
	private String senha_usuario;
    
    
    

    
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

		
	}

		
	
