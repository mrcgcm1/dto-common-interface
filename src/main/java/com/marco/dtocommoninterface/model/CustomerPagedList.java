package com.marco.dtocommoninterface.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class CustomerPagedList extends PageImpl<CustomerDto> implements Serializable {

    static final long serialVersionUID = 4272191928099029232L;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public CustomerPagedList(@JsonProperty("content") List<CustomerDto> content,
                             @JsonProperty("number") int number,
                             @JsonProperty("size") int size,
                             @JsonProperty("totalElements") Long totalElements,
                             @JsonProperty("pageable") JsonNode pageable,
                             @JsonProperty("last") boolean last,
                             @JsonProperty("totalPages") int totalPages,
                             @JsonProperty("sort") JsonNode sort,
                             @JsonProperty("first") boolean first,
                             @JsonProperty("numberOfElements") int numberOfElements) {
        super(content, PageRequest.of(number, size), numberOfElements);
    }

    public CustomerPagedList(List<CustomerDto> content, Pageable pageable, long numberOfElements) {
        super(content, pageable, numberOfElements);
    }
    public CustomerPagedList(List<CustomerDto> content) {
        super(content);
    }
}
