package br.com.bead.delivery.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.bead.delivery.service.OrderService;
import br.com.bead.delivery.dto.OrderRequest;
import br.com.bead.delivery.dto.OrderDTO;



import javax.*validation.Valid;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/orders")
@Tag(name = "Orders", description = "Operações sobre o pedido")


public class OrderController {
private final OrderService service;

public OrderController(OrderService service) {
    this.service = service;



    
}

@PostMapping
@Operation (summary = "Cria um novo pedido")
public ResponseEntity<OrderDTO> createOrder(@Valid @RequestBody OrderRequest orderRequest) {
    OrderDTO order = service.createOrder(Request);
    return  ResponseEntity.status(HttpStatus.CREATED).body(order);
}
}