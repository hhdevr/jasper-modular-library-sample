package com.chaykin.jasper.sample.module;

import com.chaykin.jasper.core.annotation.JasperModularReport;
import com.chaykin.jasper.core.model.ModularReport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JasperModularReport(templatePath = "/reports/company_report.jrxml")
public class CompanyReport extends ModularReport {

    private TitleSubModule titleSubModule;

    private FinancialSubModule financialSubModule;

}
