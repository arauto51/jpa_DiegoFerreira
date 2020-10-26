package produto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name= "Pedidos")
public class pedidos implements Serializable {

	@Id
	int codpedidos;
	@Column
	int clienteId;
	
	@Column
	int ProdutoId;
	
	@ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "clienteId", referencedColumnName = "codcliente")
	@MapKey(name="codcliente")
	

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	
	public int getClienteId() {
		return clienteId;
	}

	
	public int getCodpedidos() {
		return codpedidos;
	}

	public void setCodpedidos(int codpedidos) {
		this.codpedidos = codpedidos;
	}

	public int getProdutoId() {
		return ProdutoId;
	}

	public void setProdutoId(int produtoId) {
		ProdutoId = produtoId;
	}

}

	

