package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Invoice {
    private Integer id;
    private Integer order_id;
    private double amount;
    private Date issue;
    private Date due;
}
