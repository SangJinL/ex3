package com.example.ex3.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Locale;

@Data
@Builder (toBuilder = true)
public class SampleDTO {
    private Long sno;

    private String first;
    private String last;
    private LocalDateTime regTime;

}
