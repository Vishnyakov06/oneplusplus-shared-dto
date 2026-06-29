package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record WelcomeNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        String userName,
        String userSurname
) implements NotificationEvent {

    @Override
    public NotificationEventType getEventType() {
        return NotificationEventType.WELCOME;
    }

    @Override
    public Map<String, Object> getParams() {
        return Map.of(
                "userName", userName,
                "userSurname", userSurname
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
