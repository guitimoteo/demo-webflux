package com.example.reactiveclient;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Event {
    private final long id;
    private final Date when;
}
