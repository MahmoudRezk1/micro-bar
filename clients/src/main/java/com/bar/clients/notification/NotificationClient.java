package com.bar.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
        name = "notification",
        path = "api/v1/notification"
)
public interface NotificationClient {

    @PostMapping
    void sendNotification(NotificationRequest notificationRequest);
}
