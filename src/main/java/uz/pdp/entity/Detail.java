package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detail {
    private Integer id;
    private Integer order_id;
    private Integer product_id;
    private int quantity;
}
