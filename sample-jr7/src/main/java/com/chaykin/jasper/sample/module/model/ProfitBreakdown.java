package com.chaykin.jasper.sample.module.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProfitBreakdown {

    private String month;

    private Double revenue;

    private Double expenses;

    private Double profit;

}
