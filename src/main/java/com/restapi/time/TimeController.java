package com.restapi.time;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("/time")
    public String getTimeAndMessage() {
        LocalDateTime currentTime = LocalDateTime.now();
        return "Current time: " + currentTime.toString();
    }
}
