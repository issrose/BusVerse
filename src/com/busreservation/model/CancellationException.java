package com.busreservation.model;

/**
 * Exception thrown when a ticket cancellation request violates policy (e.g., within 2 hours of departure)
 */
public class CancellationException extends RuntimeException {
    public CancellationException(String message) {
        super(message);
    }
}
