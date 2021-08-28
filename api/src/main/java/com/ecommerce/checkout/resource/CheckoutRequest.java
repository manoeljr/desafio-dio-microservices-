package com.ecommerce.checkout.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.text.StyledEditorKit;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable {

    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInfo;
    private String paymentMethod;
    private String cardNome;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;

}
