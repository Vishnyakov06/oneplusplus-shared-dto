package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.UUID;

public record EventUpdatedNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle
) implements NotificationEvent{
}
