package br.com.timecapsuleproject.timeCapsuleService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewMessageNotification {
    private String messageId;
    private String timeCapsuleId;
    private String senderEmail;
    private String senderUsername;
    private LocalDateTime creationDate;
}
