package com.chaykin.jasper.sample.module.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExpenseItem {

    private String category;

    private Double amount;

    private Double percent;

}
