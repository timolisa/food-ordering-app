package com.simba.order.service.domain.entity;

import com.simba.domain.entity.BaseEntity;
import com.simba.domain.valueobject.MoneyVO;
import com.simba.domain.valueobject.ProductIdVO;

public class Product extends BaseEntity<ProductIdVO> {
    private String name;
    private MoneyVO price;

    public Product(ProductIdVO productId) {
        super.setId(productId);
    }

    public Product(ProductIdVO productId, String name, MoneyVO price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public MoneyVO getPrice() {
        return price;
    }

    public void updateWithConfirmedNameAndPrice(String name, MoneyVO price) {
        this.name = name;
        this.price = price;
    }
}
