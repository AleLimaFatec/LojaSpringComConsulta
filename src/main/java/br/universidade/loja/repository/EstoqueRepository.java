package br.universidade.loja.repository;

import br.universidade.loja.model.Estoque;
import br.universidade.loja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    // consultas customizadas aqui

    @Query(value = "SELECT quantidade FROM estoque e JOIN produto p" +
            " ON e.produto_id = p.id WHERE p.nome = :nome",
    nativeQuery = true)
    Integer findQuantidadeByNome(@Param("nome") String nomeProd);

    @Query("""
            SELECT e FROM Estoque e WHERE e.produto.categoria.nome=:nc
            """)
    List<Estoque> findByCategoriaNome(@Param("nc") String nomeCat);


}
