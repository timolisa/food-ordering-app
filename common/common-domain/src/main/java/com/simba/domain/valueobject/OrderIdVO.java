package com.simba.domain.valueobject;

import java.util.UUID;

public class OrderIdVO extends BaseIdVO<UUID> {

    public OrderIdVO(UUID value) {
        super(value);
    }
}
