package com.bar.fraud.controller;

import com.bar.fraud.model.FraudCheckResponse;
import com.bar.fraud.service.FraudCheckService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fraud-check")
public record FraudController(FraudCheckService fraudCheckService) {

    @PostMapping("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable int customerId) {
        return new FraudCheckResponse(fraudCheckService.isFraudulentCustomer(customerId));
    }
}
