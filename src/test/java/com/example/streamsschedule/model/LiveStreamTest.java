package com.example.streamsschedule.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class LiveStreamTest {
    @Test
    void create_new_record_live_stream() {
        LiveStream stream = new LiveStream(
            UUID.randomUUID().toString(), 
            "Building REST APIs with Spring Boot",
            """
            Spring Boot is very convenient to use when building REST APIs.
            """,
            "https://www.twitch.tv/danvega",
            LocalDateTime.of(2022, 2, 16, 11, 0, 0),
            LocalDateTime.of(2022, 2, 16, 13, 0, 0)
        );

        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.title());
        assertTrue(stream.getClass().isRecord());
        assertEquals(6, stream.getClass().getRecordComponents().length);
    }
}
