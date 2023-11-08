package com.md.norwind.entities.concrites;

import com.md.norwind.entities.abstracts.IEntity;
import lombok.*;

import javax.persistence.*;

import java.util.List;

@Table(name = "suppliers")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Supplier implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Integer id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "contact_title")
    private String contactTitle;
    @Column(name = "address")
    private String address;
    @Column(name = "region")
    private String region;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "country")
    private String country;
    @Column(name = "phone")
    private String phone;
    @Column(name = "fax")
    private String fax;


    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
