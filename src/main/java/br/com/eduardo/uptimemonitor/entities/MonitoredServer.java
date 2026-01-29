package br.com.eduardo.uptimemonitor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_monitoredServers")
@Data
public class MonitoredServer {

    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private String status; // only "UP" and "DOWN"
    private LocalDateTime lastChecked;
    private int responseTimeMs;
}
