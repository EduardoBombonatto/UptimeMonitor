package br.com.eduardo.uptimemonitor.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record MonServerRequestDTO(
        @NotBlank(message = "The name of the service is required")
        String name,

        @NotBlank(message = "The URL is required")
        @Pattern(regexp = "^(http|https)://.*$", message = "The URL must start with http:// or https://")
        String url
) {
}
