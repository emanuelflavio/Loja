package br.com.primeshoes.api.entities;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="products")
@Setter
@Getter
public class Product {

    @Id
    private Long id;
    private String name;
    private double price;
    private int stock;


}
