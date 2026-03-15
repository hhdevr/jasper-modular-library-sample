package com.chaykin.jaspermodularsample.module.model;

import lombok.Data;

@Data
public class ExpenseItem {

    private String category;
    private Double amount;
    private Double percent;

    public ExpenseItem(String category, Double amount, Double percent) {
        this.category = category;
        this.amount = amount;
        this.percent = percent;
    }

}
