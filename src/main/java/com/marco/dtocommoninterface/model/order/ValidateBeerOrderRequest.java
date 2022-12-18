package com.marco.dtocommoninterface.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ValidateBeerOrderRequest {
    static final long serialVersionUID = -3823394930387935997L;

    private BeerOrderDto beerOrderDto;

    private UUID beerId;



}
