package org.example.model.report;

import java.time.LocalDateTime;

public class Report {
    private Long id;
    private ReportType type;
    private ChartType chartType;
    private LocalDateTime generatedDate;
    private String content;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public ReportType getType() { return type; }
    public void setType(ReportType type) { this.type = type; }
    public ChartType getChartType() { return chartType; }
    public void setChartType(ChartType chartType) { this.chartType = chartType; }
    public LocalDateTime getGeneratedDate() { return generatedDate; }
    public void setGeneratedDate(LocalDateTime generatedDate) { this.generatedDate = generatedDate; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
