package com.bar.notification.service;

import com.bar.clients.notification.NotificationRequest;
import com.bar.notification.entity.Notification;
import com.bar.notification.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record NotificationService (NotificationRepository notificationRepository){

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerEmail())
                        .sender("Mahmoud Barakat")
                        .message(notificationRequest.message())
                        .sendAt(LocalDateTime.now())
                        .build()
        );
    }
}
