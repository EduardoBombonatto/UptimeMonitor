package br.com.eduardo.uptimemonitor.dtos;

import java.util.UUID;

public record MonServerResponseDTO(
        UUID id,
        String name,
        String url,
        String status,
        String lastChecked, // Date to String to the front end.
        Integer responseTimeMs
) {
}
