package br.com.bead.delivery.repository;        
import br.com.bead.delivery.model.produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public class produtoRepository {
  List<produto> finByNomeContaining(String nome) {
    return null; 
  }    
}
