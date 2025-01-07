package io.github.Pedrohsantosg.produtosapi.repository;

import io.github.Pedrohsantosg.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
