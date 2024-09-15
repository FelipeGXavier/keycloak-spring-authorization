package com.example.invoices.rest;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoicesController {

    @GetMapping("/api/v1/invoices")
    public String listInvoices(@AuthenticationPrincipal Jwt jwt) {
        return "List invoice";
    }

    @GetMapping("/api/v1/invoices/{id}")
    public String getInvoice(@AuthenticationPrincipal Jwt jwt, @PathVariable String id) {
        return "Detail invoice " + id;
    }

    @PostMapping("/api/v1/invoices")
    public String createInvoice(@AuthenticationPrincipal Jwt jwt) {
        return "Creating an invoice";
    }

}
