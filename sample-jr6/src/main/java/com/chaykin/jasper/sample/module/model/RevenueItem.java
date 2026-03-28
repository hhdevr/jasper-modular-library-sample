package com.chaykin.jasper.sample.module.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RevenueItem {

    private String category;

    private Double amount;

    private Double percent;

}

