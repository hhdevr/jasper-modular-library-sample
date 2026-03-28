package com.chaykin.jasper.sample.module;

import com.chaykin.jasper.core.annotation.JasperSubreport;
import com.chaykin.jasper.core.model.SubreportModule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JasperSubreport(templatePath = "/reports/sub_financial_report.jrxml")
public class FinancialSubModule extends SubreportModule {

    private RevenueSubModule revenueSubModule;

    private ExpenseSubModule expenseSubModule;

    private ProfitSubModule profitSubModule;

    @Override
    public boolean isEmpty() {
        return revenueSubModule == null;
    }

}
