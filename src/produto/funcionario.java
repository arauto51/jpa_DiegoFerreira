package produto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "funcionario")
public class funcionario implements Serializable {

	@Id
	@Column
	int id;
	@Column
	String nome;
	@Column
	int codeId;
	
	@OneToOne(cascade=CascadeType.ALL) @JoinColumn(name = "codeId", referencedColumnName = "codloja")
	
	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}
	
	public int getCodeId() {
		return codeId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	
	}
	
	
	

}
