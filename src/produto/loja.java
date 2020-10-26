package produto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "loja")
public class loja implements Serializable {

	@Id
	@Column
	int codloja;
	@Column
	String nome;
	
	
	
	public int getId() {
		return codloja;
	}
	public void setId(int id) {
		this.codloja = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
