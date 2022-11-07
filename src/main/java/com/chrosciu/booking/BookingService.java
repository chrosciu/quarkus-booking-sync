package com.chrosciu.booking;

import javax.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.jbosslog.JBossLog;

@ApplicationScoped
@RequiredArgsConstructor
@JBossLog
public class BookingService {
    private final FlightService flightService;
    private final HotelService hotelService;
    private final AuditService auditService;

    public String book(String destination) {
        try {
            log.infof("[%s] Start booking...", destination);
            String result = flightService.bookFlight(destination) + "\n" + hotelService.bookHotel(destination);
            log.infof("[%s] Booking finished!", destination);
            auditService.auditTravel(destination);
            return result;
        } catch (Exception e) {
            log.warn("Error occured during booking: ", e);
            return "Error: " + e.getMessage();
        }
    }
}
