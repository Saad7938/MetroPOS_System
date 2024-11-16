package org.example.controller.report;

import org.example.model.report.Report;
import org.example.service.report.ReportService;

public class ReportController {
    private final ReportService reportService;

    public ReportController() {
        this.reportService = new ReportService();
    }

    public Report generateReport(Report report) {
        return reportService.generateReport(report);
    }
}
