package br.com.timecapsuleproject.timeCapsuleService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInvitationNotification {
    private String timeCapsuleId;
    private String timeCapsuleName;
    private String invitedUserEmail;
    private String inviterUserId;
}
