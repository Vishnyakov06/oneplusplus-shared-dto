package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record EventDeletedNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle
) implements NotificationEvent {
    @Override
    public NotificationEventType eventType() {
        return NotificationEventType.EVENT_DELETED;
    }
    @Override
    public Map<String, Object> params() {
        return Map.of(
                "eventId", eventId,
                "eventTitle", eventTitle
        );
    }
}
