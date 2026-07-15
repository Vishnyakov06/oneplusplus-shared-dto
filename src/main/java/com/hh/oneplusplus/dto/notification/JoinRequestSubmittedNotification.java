package com.hh.oneplusplus.dto.notification;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public record JoinRequestSubmittedNotification(
        UUID notificationId,
        Long userId,
        String email,
        NotificationType type,
        Instant createdAt,
        Long eventId,
        String eventTitle,
        Long joinRequestId,
        ActorDto actor
) implements NotificationEvent {

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
    public NotificationEventType getEventType() {
        return NotificationEventType.JOIN_REQUEST_SUBMITTED;
    }

    @Override
    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    @JsonIgnore
    public Map<String, Object> getParams() {
        Map<String, Object> params = new HashMap<>();
        params.put("eventId", eventId);
        params.put("eventTitle", eventTitle);
        params.put("joinRequestId", joinRequestId);
        params.put("actor", actor);
        return params;
    }
}
