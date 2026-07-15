package com.hh.oneplusplus.dto.notification;

import java.util.Set;

public enum NotificationEventType {
    EVENT_DELETED,
    EVENT_UPDATED,
    MEMBER_JOINED,
    INVITE,
    MEMBER_KICKED,
    MEMBER_LEFT,
    WELCOME,
    JOIN_REQUEST_SUBMITTED,
    JOIN_REQUEST_APPROVED,
    JOIN_REQUEST_REJECTED;


    public static final Set<String> GROUPABLE_TYPES = Set.of(
            MEMBER_JOINED.name(),
            MEMBER_LEFT.name(),
            JOIN_REQUEST_SUBMITTED.name()
    );
}
