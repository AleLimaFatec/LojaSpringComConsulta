package br.universidade.loja;

import br.universidade.loja.model.Categoria;
import br.universidade.loja.model.Estoque;
import br.universidade.loja.model.Produto;
import br.universidade.loja.repository.CategoriaRepository;
import br.universidade.loja.repository.EstoqueRepository;
import br.universidade.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class LojaApplication {
	@Autowired
	private CategoriaRepository catRepo;
	@Autowired
	private ProdutoRepository prodRepo;
	@Autowired
	private EstoqueRepository estRepo;



    public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
////		System.out.println("Loja inicializada!");
////		Categoria info = new Categoria("Informática");
////		Categoria perif = new Categoria("Periféricos");
////		Categoria acess = new Categoria("Acessórios");
////		catRepo.saveAll(List.of(info, perif, acess));
////
////		Produto note = new Produto("Notebook",new BigDecimal("3500.00"),info);
////		Produto impressora = new Produto("Impressora",new BigDecimal("750.50"),perif);
////		Produto monitor = new Produto("Monitor",new BigDecimal("1800.90"),perif);
////		Produto teclado = new Produto("Teclado",new BigDecimal("300.75"),acess);
////		Produto Mouse = new Produto("Mouse",new BigDecimal("189.00"),acess);
////
////		prodRepo.saveAll(List.of(note, impressora, monitor, teclado, Mouse));
////
////		Estoque est1 = new Estoque(note, 50);
////		Estoque est2 = new Estoque(impressora, 10);
////		Estoque est3 = new Estoque(monitor, 15);
////		Estoque est4 = new Estoque(teclado, 66);
////		Estoque est5 = new Estoque(Mouse, 33);
////
////		estRepo.saveAll(List.of(est1, est2, est3, est4, est5));
//		List<Produto> produtoCat =  prodRepo.findByCategoriaNome("Periféricos");
//		produtoCat.forEach(p -> System.out.println(p.getNome()));
//
//		List<Produto> produtoCaro =
//				prodRepo.findByPrecoGreaterThan(new BigDecimal("500.00"));
//
//		produtoCaro.forEach(p->
//				System.out.println(p.getNome()+" | "+p.getPreco()));
//
//		System.out.println("Existe o Produto Informado: "+
//				prodRepo.existsByNome("Note"));
//
//		List<Estoque> estoqueList =  estRepo.findByCategoriaNome("Acessórios");
//		estoqueList.forEach(e -> System.out.println(e.getProduto().getNome()));
//
//		int quantidade = estRepo.findQuantidadeByNome("Monitor");
//		System.out.println("Quantidade de Monitor: "+quantidade);
//
//	}

}
