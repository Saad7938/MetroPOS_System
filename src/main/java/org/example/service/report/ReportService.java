package org.example.service.report;

import org.example.model.report.Report;
import org.example.repository.report.ReportRepository;

public class ReportService {
    private final ReportRepository reportRepository;

    public ReportService() {
        this.reportRepository = new ReportRepository();
    }

    public Report generateReport(Report report) {
        return reportRepository.save(report);
    }
}
