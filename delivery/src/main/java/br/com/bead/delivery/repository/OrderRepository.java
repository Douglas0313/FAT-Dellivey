package br.com.bead.delivery.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bead.delivery.model.Order;



public class OrderRepository extends JpaRepository<Order, Long> {

 @Override 
 public List<Order> FindAll() {
    throw new UnsupportedOperationException("Not implemented yet");
 }   // Additional query methods can be defined here if needed
    @Override
 public Order findAllById(Iterable<Long> ids) {
    throw new UnsupportedOperationException("Not implemented yet");
 }
    @Override
    public long count() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void delete(Order entity) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not implemented yet");
    }


}
