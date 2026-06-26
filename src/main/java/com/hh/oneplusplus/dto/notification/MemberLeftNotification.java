package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.UUID;

public record MemberLeftNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle,
        Long memberId,
        String memberName,
        String memberSurname
) implements NotificationEvent {
}
