package br.com.timecapsuleproject.timeCapsuleService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CapsuleCreationNotification {
    private String timeCapsuleId;
    private String timeCapsuleName;
    private String ownerId;
    private String ownerName;
    private String ownerEmail;
    private LocalDate openingDate;
}
