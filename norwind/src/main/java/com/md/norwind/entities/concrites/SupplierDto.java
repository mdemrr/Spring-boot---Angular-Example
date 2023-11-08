package com.md.norwind.entities.concrites;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Supplier}
 */
@Value
public class SupplierDto implements Serializable {
    String companyName;
}