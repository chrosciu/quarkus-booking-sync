package com.chrosciu.booking;

import java.util.concurrent.TimeUnit;
import javax.enterprise.context.ApplicationScoped;
import lombok.SneakyThrows;
import lombok.extern.jbosslog.JBossLog;

@ApplicationScoped
@JBossLog
public class FlightService {
    public String bookFlight(String destination) {
        return performBooking(destination);
    }

    @SneakyThrows
    private String performBooking(String destination) {
        log.infof("[%s] Start booking...", destination);
        if ("Moscow".equals(destination)) {
            throw new IllegalStateException("Cannot book flight to Russia!");
        }
        TimeUnit.SECONDS.sleep(3);
        log.infof("[%s] Booking finished!", destination);
        return "Booked flight to " + destination;
    }
}
