package com.chrosciu.booking;


import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;

@Path("/booking")
@RequiredArgsConstructor
public class BookingResource {
    private final BookingService bookingService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String book(@FormParam("destination") String destination) {
        return bookingService.book(destination);
    }

}
