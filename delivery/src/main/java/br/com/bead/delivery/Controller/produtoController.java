package br.com.bead.delivery.Controller;
import br.com.bead.delivery.Model.Produto;
import br.com.bead.delivery.Service.ProdutoService;

import org.apache.catalina.connector.Request;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class produtoController {
    
    private final ProdutoService Service;

    public produtoController(ProdutoService Service) {
        this.Service = Service;
    }

    @GetMapping
    public produto criar(RequestBody Produto produto) {
        return Service.salvar(produto);
    }
}
