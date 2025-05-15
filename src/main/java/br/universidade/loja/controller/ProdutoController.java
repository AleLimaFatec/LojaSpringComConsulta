package br.universidade.loja.controller;

import br.universidade.loja.model.Produto;
import br.universidade.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {
    @Autowired
    ProdutoRepository repository;

    @GetMapping("/produtos")
    public List<Produto> getAllProdutos() {
        return repository.findAll();
    }

    @PostMapping("/produtos")
    public Produto createProduto(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @GetMapping("/produtos/{id}")
    public Optional<Produto> getProdutoById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/produtos/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto prodAtualizado) {
        return repository.findById(id).map(produto -> {
            produto.setNome(prodAtualizado.getNome());
            produto.setPreco(prodAtualizado.getPreco());
            produto.setCategoria(prodAtualizado.getCategoria());
            return repository.save(produto);
        }).orElseGet(() -> {
            prodAtualizado.setId(id);
            return repository.save(prodAtualizado);
        });
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
