package com.bar.notification.controller;

import com.bar.clients.notification.NotificationRequest;
import com.bar.notification.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/notification")
@Slf4j
public record NotificationController (NotificationService notificationService) {
    @PostMapping
    public void sendNotification(@RequestBody NotificationRequest notificationRequest) {
        log.info("New notification request: {}", notificationRequest);
        notificationService.send(notificationRequest);
    }
}
