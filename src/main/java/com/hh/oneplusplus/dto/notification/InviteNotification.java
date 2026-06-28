package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record InviteNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle,
        String inviteUrl
) implements NotificationEvent{
    @Override
    public NotificationEventType eventType() {
        return NotificationEventType.INVITE;
    }
    @Override
    public Map<String, Object> params() {
        return Map.of(
                "eventId", eventId,
                "eventTitle", eventTitle,
                "inviteUrl", inviteUrl
        );
    }
}
