package com.sid.content_calendar.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type type,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
