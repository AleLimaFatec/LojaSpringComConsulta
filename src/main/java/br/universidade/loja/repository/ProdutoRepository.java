package br.universidade.loja.repository;

import br.universidade.loja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // consultas customizadas aqui
    List<Produto> findByCategoriaNome(String cat);
    List<Produto> findByPrecoGreaterThan(BigDecimal preco);
    boolean existsByNome(String nome);

}
