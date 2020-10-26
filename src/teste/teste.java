package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import produto.Cliente;
import produto.funcionario;
import produto.loja;
import produto.pedidos;
import produto.produto1;

public class teste {

	public static void main(String[] args) {
		funcionario f = new funcionario();
		loja l = new loja();
		produto1 p = new produto1();
		Cliente c = new Cliente();
		pedidos pe = new pedidos();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_jpa21");
		EntityManager em = emf.createEntityManager();
//CLiente
		
		c.setId(1);  c.setNome("Carlos");   

//-------------------------------------------------------------------------------------------------------			
//produtos
	
		p.setId(1);   p.setNome("Refrigerante - Coca_Cola 2L");  p.setValor(8.50);   
		
//-------------------------------------------------------------------------------------------------------		
//pedidos
			
		 pe.setCodpedidos(1);	 pe.setClienteId(1);   pe.setProdutoId(1);
				
//-------------------------------------------------------------------------------------------------------		
//Loja	
		l.setId(1); l.setNome("Squina Bebida");
			
//-------------------------------------------------------------------------------------------------------		
//funcionario		
		 	
		f.setId(1); f.setNome("Francisco");	f.setCodeId(1);
			
		
		
	//inserir dados na tabela
		
	try {
		
		em.getTransaction().begin();
		em.persist(c);
		em.persist(p);
		em.persist(pe);
		em.persist(l);
		em.persist(f);
		em.getTransaction().commit();
		
		System.out.print("Dados Inseridos no Banco");
	
	} catch (Exception e) {
		
		System.out.print("Erro ao Inserir Dados" + e);
	
	} finally {
		
		em.close();
		emf.close();
	}

	}

}
