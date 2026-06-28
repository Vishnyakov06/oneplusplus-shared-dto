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
    public NotificationEventType eventType() {
        return NotificationEventType.WELCOME;
    }

    @Override
    public Map<String, Object> params() {
        return Map.of(
                "userName", userName,
                "userSurname", userSurname
        );
    }
}
