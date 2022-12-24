package com.marco.dtocommoninterface.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ValidateOrderResult implements Serializable {

    static final long serialVersionUID = 7790538571145536435L;

    private boolean isValid;

    private UUID orderId;
}
