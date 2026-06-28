package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record MemberLeftNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle,
        ActorDto actor
) implements NotificationEvent {

    @Override
    public NotificationEventType eventType() {
        return NotificationEventType.MEMBER_LEFT;
    }

    @Override
    public Map<String, Object> params() {
        return Map.of(
                "eventId", eventId,
                "eventTitle", eventTitle,
                "actor", actor
        );
    }
}
