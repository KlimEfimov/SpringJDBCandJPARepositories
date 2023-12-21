package com.ex1.intellektaspringwebex1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Entity
@Table(name = "sales")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SaleJPA {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sales_is_seq")
    @SequenceGenerator(name = "sales_is_seq", sequenceName = "sales_is_seq", allocationSize = 1)
    private int id;

    @Column(name = "product_id")
    private String product_id;

    @Column(name = "store_date")
    private Date store_date;

    @Column(name = "sales_date")
    private Date sales_date;

    @Column(name = "price")
    private float price;


}
