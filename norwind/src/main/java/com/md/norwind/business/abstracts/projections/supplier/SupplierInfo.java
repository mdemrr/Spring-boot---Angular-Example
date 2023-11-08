package com.md.norwind.business.abstracts.projections.supplier;

/**
 * Projection for {@link com.md.norwind.entities.concrites.Supplier}
 */
public interface SupplierInfo {
    Integer getId();

    String getCompanyName();

    String getContactName();

    String getContactTitle();

    String getAddress();

    String getRegion();

    String getPostalCode();

    String getCountry();

    String getPhone();

    String getFax();
}