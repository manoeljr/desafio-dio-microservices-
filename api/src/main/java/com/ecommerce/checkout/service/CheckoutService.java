package com.ecommerce.checkout.service;

import com.ecommerce.checkout.entity.CheckoutEntity;
import com.ecommerce.checkout.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

}
