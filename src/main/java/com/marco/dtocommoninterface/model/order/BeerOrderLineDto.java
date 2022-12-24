package com.marco.dtocommoninterface.model.order;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
//@RequiredArgsConstructor
//@Builder
@EqualsAndHashCode(callSuper = true)
public class BeerOrderLineDto extends BaseItem implements Serializable {
    private String upc;
    private String beerName;

    private String beerStyle;
    private UUID beerId;
    private Integer orderQuantity = 0;
    private Integer quantityAllocated;

    private BigDecimal price;

//    @JsonProperty("id")
//    private UUID id = null;
//
//    @JsonProperty("version")
//    private Integer version = null;
//
//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
//    @JsonProperty("createdDate")
//    private OffsetDateTime createdDate = null;
//
//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
//    @JsonProperty("lastModifiedDate")
//    private OffsetDateTime lastModifiedDate = null;

    @Builder
    public BeerOrderLineDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
                            String upc, String beerName, String beerStyle, UUID beerId, Integer orderQuantity,
                            Integer quantityAllocated, BigDecimal price) {
        super(id, version, createdDate, lastModifiedDate);

        this.upc = upc;
        this.beerName = beerName;

        this.beerStyle = beerStyle;
        this.beerId = beerId;
        this.orderQuantity = orderQuantity;
        this.quantityAllocated = quantityAllocated;

        this.price = price;

    }


}
