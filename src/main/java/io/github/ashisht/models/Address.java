package io.github.ashisht.models;

import lombok.Builder;
import lombok.Data;

/**
 * @author ashish.thakur on 12-10-2021
 */
@Data
@Builder
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
}
