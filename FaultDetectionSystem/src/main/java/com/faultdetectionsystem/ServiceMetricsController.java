package com.faultdetectionsystem;

// Replace with your actual package name

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ServiceMetricsController {

    @GetMapping("/metrics")
    public Map<String, String> getMetrics() {
        Map<String, String> metrics = new HashMap<>();
        metrics.put("serviceName", "MyService"); // Replace with your service name
        metrics.put("status", "Running");
        metrics.put("uptime", "5 minutes"); // Placeholder value, implement actual logic if needed
        return metrics;
    }
}
