package com.lalbr.core.sensordata.carbonmonoxide;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CORepository extends JpaRepository<COModel, Long> {
    List<COModel> findCOModelsByTimestampBetween(LocalDateTime startOfDay, LocalDateTime endOfDay);
}