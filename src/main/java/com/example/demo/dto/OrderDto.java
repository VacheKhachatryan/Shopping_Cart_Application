package com.example.demo.dto;

import com.example.demo.persistance.order.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class OrderDto {

    @NotNull
    private UUID id;

    @NotNull
    private UUID customerId;

    @NotNull
    private UUID productId;

    @NotNull
    private Integer orderedQuantity;

    @NotNull
    private OrderStatus status;


}
