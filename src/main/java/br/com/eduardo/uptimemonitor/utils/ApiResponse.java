package br.com.eduardo.uptimemonitor.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private HttpStatus statusCode;
    private T data;
    private LocalDateTime localDateTime;

    public static <T> ApiResponse<T> success(T data, String message, HttpStatus statusCode) {
        return ApiResponse.<T>builder()
                .success(true)
                .message(message)
                .data(data)
                .localDateTime(LocalDateTime.now())
                .statusCode(statusCode)
                .build();
    }

    public static <T> ApiResponse<T> error(String message, HttpStatus statusCode) {
        return ApiResponse.<T>builder()
                .success(false)
                .message(message)
                .localDateTime(LocalDateTime.now())
                .statusCode(statusCode)
                .build();
    }

}
