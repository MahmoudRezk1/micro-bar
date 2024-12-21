package com.bar.clients.notification;


public record NotificationRequest(
        int toCustomerId,
        String toCustomerEmail,
        String message
) {
}
