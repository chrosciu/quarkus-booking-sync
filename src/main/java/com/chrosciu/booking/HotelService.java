package com.chrosciu.booking;

import java.util.concurrent.TimeUnit;
import javax.enterprise.context.ApplicationScoped;
import lombok.SneakyThrows;
import lombok.extern.jbosslog.JBossLog;

@ApplicationScoped
@JBossLog
public class HotelService {
    public String bookHotel(String destination) {
        return performBooking(destination);
    }

    @SneakyThrows
    private String performBooking(String destination) {
        log.infof("[%s] Start booking...", destination);
        TimeUnit.SECONDS.sleep(3);
        log.infof("[%s] Booking finished!", destination);
        return "Booked hotel in " + destination;
    }
}
