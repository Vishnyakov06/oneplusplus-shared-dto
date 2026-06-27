package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.UUID;

public record MemberJoinedNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle,
        Long joinedUserId,
        String joinedUserName,
        String joinedUserSurname
) implements NotificationEvent {
    @Override
    public NotificationEventType eventType() {
        return NotificationEventType.MEMBER_JOINED;
    }
}
