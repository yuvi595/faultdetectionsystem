package com.faultdetectionsystem;



public class MonitoringTask implements Runnable {
    private String serviceName;

    public MonitoringTask(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void run() {
        // Simulate monitoring logic
        while (true) {
            System.out.println("Monitoring service: " + serviceName);
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
