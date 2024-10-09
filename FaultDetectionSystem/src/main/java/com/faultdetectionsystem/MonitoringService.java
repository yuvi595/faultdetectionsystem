package com.faultdetectionsystem;
// Replace with your actual package name

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class MonitoringService {
    
    private Thread monitoringThread;

    @PostConstruct
    public void startMonitoring() {
        monitoringThread = new Thread(new MonitoringTask("MyService")); // Replace "MyService" with your service name
        monitoringThread.start();
    }

    @PreDestroy
    public void stopMonitoring() {
        monitoringThread.interrupt(); // Stop the monitoring thread when the application context is closed
    }
}
