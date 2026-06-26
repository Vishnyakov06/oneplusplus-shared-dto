package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.UUID;

public record WelcomeNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        String message,
        String userName,
        String userSurname
) implements NotificationEvent{
}
