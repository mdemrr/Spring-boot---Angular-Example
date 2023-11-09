package com.md.norwind.entities.concrites;

import com.md.norwind.entities.abstracts.IEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "products")
@Entity
@Setter
@Getter
public class Product implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;
    @Column(name = "product_name")
    private String productName;
    //@Column(name = "supplier_id")
    //private Integer supplierId;
    @ManyToOne()
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;
}
