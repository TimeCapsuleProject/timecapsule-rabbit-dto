package br.com.timecapsuleproject.timeCapsuleService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLeaveNotification {
    private String timeCapsuleId;
    private String timeCapsuleName;
    private String userId;
    private String userEmail;
}
