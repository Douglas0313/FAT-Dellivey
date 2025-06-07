package br.com.bead.delivery.service;
import br.com.bead.delivery.model.produto;
import br.com.bead.delivery.repository.produtoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@service

public class produtoService {
    private final produtoRepository repository;
    public produtoService(produtoRepository repository) {
        this.repository = repository;
    }

    public List<produto> listrarTodos() {
        return repository.findAll();
    }

    public produto salvar(produto produto) {
        return repository.save(produto);
    }
}
