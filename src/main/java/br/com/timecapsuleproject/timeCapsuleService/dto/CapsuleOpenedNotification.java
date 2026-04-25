package br.com.timecapsuleproject.timeCapsuleService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CapsuleOpenedNotification {
    private String timeCapsuleId;
    private String timeCapsuleName;
    private LocalDate openingDate;
    private String userName;
    private String userEmail;
}

