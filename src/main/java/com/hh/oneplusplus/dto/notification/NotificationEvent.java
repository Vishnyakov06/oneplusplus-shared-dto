package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public interface NotificationEvent {
    UUID getNotificationId();
    Long getUserId();
    String getEmail();
    NotificationType getType();
    NotificationEventType getEventType();
    Instant getCreatedAt();
    Map<String, Object> getParams();
}
