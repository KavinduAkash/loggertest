package com.ceyentra.loggertest.loggertest.dto;

import lombok.*;

/**
 * @author hp
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ResponseDTO {
    private int status;
    private boolean success;
    private String message;
}
