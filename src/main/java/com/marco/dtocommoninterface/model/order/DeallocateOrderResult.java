package com.marco.dtocommoninterface.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeallocateOrderResult implements Serializable {

    private BeerOrderDto beerOrderDto;

}
