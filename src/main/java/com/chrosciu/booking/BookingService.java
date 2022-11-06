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

    public String book(String destination) {
        log.infof("[%s] Start booking...", destination);
        String result = flightService.bookFlight(destination) + "\n" + hotelService.bookHotel(destination);
        log.infof("[%s] Booking finished!", destination);
        return result;
    }
}
