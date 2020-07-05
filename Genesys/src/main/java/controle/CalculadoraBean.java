package controle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "CalculadoraBean")
@RequestScoped
public class CalculadoraBean {

	private double valor1;
	
	private double valor2;
	
	private double resultado;
	
	//**Metodo somar, ultilizado para somar os valores( 1 e 2), q é atravez do "resultado"
	
	public void Somar() {
		this.resultado = this.valor1 + this.valor2;
		System.out.println("SOMEEI");
	}
		
	public void Subtrair() {	
	this.resultado = this.valor1 - this.valor2;
	System.out.println("DIMINUII");
	
	}
	public void Dividir() {	
		
	if(this.valor1 == 0) {
	FacesContext.getCurrentInstance()
	.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "ERRO!!!"));
	}else {
		this.resultado = this.valor1/this.valor2;
		System.out.println("OK");

	}
	
		
	}

	

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	
}