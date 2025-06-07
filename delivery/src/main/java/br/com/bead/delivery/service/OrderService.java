package br.com.bead.delivery.service;
import org.springframework.stereotype.Service;
import br.com.bead.delivery.model.Order;
import br.com.bead.delivery.repository.OrderRepository;

import br.com.bead.delivery.dto.OrderDTO;
import br.com.bead.delivery.dto.OrderRequest;
import org.modelmapper.ModelMapper;


import java.time.LocalDateTime;

@Service
public class OrderService {
    private final OrderRepository repo;
    plublic OrderService(OrderRepository repo, ModelMapper modelMapper) {
        this.repo = repo;
        this.mapper = mapper;
    }
     public Order createOrder(OrderRequest req) {
        Order order = new Order();
        order.setCustomerName(orderRequest.getCustomerName());
        order.setDeliveryAmount(orderRequest.getDeliveryAmount());
        order.setCreatedAT(localDateTime.now());
    
        order saved = repo.save(order);

        return mapper.map(saved, OrderDTO.class);
}
