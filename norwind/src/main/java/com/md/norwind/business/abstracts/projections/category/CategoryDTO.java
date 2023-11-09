package com.md.norwind.business.abstracts.projections.category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO for {@link com.md.norwind.entities.concrites.Category}
 */
@Getter
@Setter
@AllArgsConstructor
public class CategoryDTO {
    Integer id;
    String categoryName;
    String description;
    byte[] picture;
}