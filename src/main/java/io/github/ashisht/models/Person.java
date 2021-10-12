package io.github.ashisht.models;

import lombok.Builder;
import lombok.Data;

/**
 * @author ashish.thakur on 12-10-2021
 */
@Data
@Builder
public class Person {
    private String name;
    private Integer age;
    private Address address;
}
