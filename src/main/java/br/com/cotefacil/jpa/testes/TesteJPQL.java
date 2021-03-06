package br.com.cotefacil.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.cotefacil.jpa.modelo.Categoria;
import br.com.cotefacil.jpa.modelo.Conta;
import br.com.cotefacil.jpa.modelo.Movimentacao;

public class TesteJPQL {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setId(2L);
		
		Categoria categoria = new Categoria();
		categoria.setId(2L);
		
		String jpql = "select m from Movimentacao m join m.categorias c where c = :pCategoria "
				+ "order by m.valor desc";
		TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
		query.setParameter("pCategoria", categoria);
		
		
		List<Movimentacao> resultList = query.getResultList();
		for (Movimentacao movimentacao : resultList) {
			System.out.println("Categorias: " + movimentacao.getCategorias());
			System.out.println("Descricao: " + movimentacao.getDescricao());
			System.out.println("Valor: " + movimentacao.getValor());
			System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
		}

	}

}
