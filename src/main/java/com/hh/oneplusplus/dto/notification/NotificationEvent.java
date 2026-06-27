package com.hh.oneplusplus.dto.notification;

import java.time.Instant;
import java.util.UUID;

public interface NotificationEvent {
    UUID notificationId();
    Long userId();
    String email();
    NotificationType type();
    NotificationEventType eventType();
    Instant createdAt();
}
