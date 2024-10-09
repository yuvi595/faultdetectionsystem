package com.faultdetectionsystem;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceMetricsRepository extends JpaRepository<ServiceMetrics, Long> {
    List<ServiceMetrics> findByServiceName(String serviceName);
}
