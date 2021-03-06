package aula4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuperMercadoTest {

	@Test
	public void test() {
		
		SuperMercado superMercado = new SuperMercado();
		assertTrue(superMercado.getQuantidadeDeProdutos() == 0);
		
		Produto produto = new Produto("Sabonete", 1.50, 100, "limpeza");
		superMercado.cadastrarProduto(produto);
		
		assertTrue(superMercado.getQuantidadeDeProdutos() == 1);
		
		produto = new Produto("Leite ninho", 13.99, 50, "Alimento");
		superMercado.cadastrarProduto(produto);
		
		assertTrue(superMercado.getQuantidadeDeProdutos() == 2);
		
		Produto produto2 = new Produto("Ra��o", 49.90, 25, "Pet");
		superMercado.cadastrarProduto(produto2);
		
		assertTrue(superMercado.getQuantidadeDeProdutos() == 3);		
	}

}
