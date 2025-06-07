package br.com.bead.delivery.model;
import lombok.Data;
import javax.perpersistence.*;

import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data

public class Order {
    @Id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private BigDecimal totalAmount;
    
    private LocalDateTime createdAT;
}
