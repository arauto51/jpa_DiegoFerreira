package produto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Produto1")
public class produto1 implements Serializable {
	@Id
	
	int codproduto;
	@Column
	String nome;
	@Column
	double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getId() {
		return codproduto;
	}
	public void setId(int id) {
		this.codproduto = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
