package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record MemberKickedNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle
) implements NotificationEvent {

    @Override
    public NotificationEventType getEventType() {
        return NotificationEventType.MEMBER_KICKED;
    }

    @Override
    public Map<String, Object> getParams() {
        return Map.of(
                "eventId", eventId,
                "eventTitle", eventTitle
        );
    }
    @Override
    public UUID getNotificationId() {
        return notificationId;
    }

    @Override
    public Long getUserId() {
        return userId;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public NotificationType getType() {
        return type;
    }

    @Override
    public Instant getCreatedAt() {
        return createdAt;
    }
}
