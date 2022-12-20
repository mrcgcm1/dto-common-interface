package com.marco.dtocommoninterface.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AllocateOrderResponse {

    private BeerOrderDto beerOrderDto;

    private Boolean allocationError = false;

    private Boolean pendingInventory = false;
}
