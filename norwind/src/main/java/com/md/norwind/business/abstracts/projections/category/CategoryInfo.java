package com.md.norwind.business.abstracts.projections.category;

/**
 * Projection for {@link com.md.norwind.entities.concrites.Category}
 */
public interface CategoryInfo {
    Integer getId();

    String getCategoryName();

    String getDescription();

    byte[] getPicture();
}