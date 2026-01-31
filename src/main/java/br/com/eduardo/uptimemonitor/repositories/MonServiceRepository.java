package br.com.eduardo.uptimemonitor.repositories;

import br.com.eduardo.uptimemonitor.entities.MonitoredServer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MonServiceRepository extends JpaRepository<MonitoredServer, UUID> {
    boolean existsByName(String name);
}
