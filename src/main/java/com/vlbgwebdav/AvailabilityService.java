package com.vlbgwebdav;

import io.opentelemetry.instrumentation.annotations.WithSpan;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/get-number-of-seats")
public class AvailabilityService {

    private static final Logger LOG = Logger.getLogger(AvailabilityService.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @WithSpan("get-number-of-seats")
    public String getNumberOfSeats() {
        LOG.info("Method 'getNumberOfSeats' called.");
        return "30";
    }

}
